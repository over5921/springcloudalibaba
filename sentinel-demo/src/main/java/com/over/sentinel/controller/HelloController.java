package com.over.sentinel.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.alibaba.csp.sentinel.slots.block.RuleConstant;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRule;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRuleManager;
import com.over.sentinel.entity.UserEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jsflz on 2022/5/19 16:12
 */
@RestController
public class HelloController {

    public static final String RESOURCE_NAME = "hello";

    /**
     * @SentinelResource 改善接口中资源定义和被流控降级后的处理方法
     * <p>
     * 怎么使用： 1 添加 依赖<artifactId>sentinel‐annotation‐aspectj</artifactId>
     * 2 配置bean SentinelResourceAspect
     * value 定义资源
     * blockHandler 设置 流控降级后的处理方法（默认该方法必须声明在同一个类）
     * 如果不想在同一个类中 blockHandlerClass 但是方法必须是static
     * fallback 当接口出现了异常，就可以交给fallback指定的方法进行处理
     * blockHandler 如果和fallback同时指定了，则blockHandler 优先级更高
     */
    @RequestMapping(value = "/hello")
    @SentinelResource(value = RESOURCE_NAME,
            fallback = "fallback",
            blockHandler = "handleException"
    )
    public UserEntity hello(String id) {
        int a =1/0;
        return new UserEntity("over");
    }

    public UserEntity fallback(String id, Throwable ex) {
        ex.printStackTrace();
        return new UserEntity("异常！");
    }

    /**
     * 注意:
     * 1.一定要public
     * 2. 返回值一定要和原方法保持一致，包含原方法的参数。
     * 3. 可以在参数最后添加BlockException 可以区分是什么规则的处理方法
     */
    public UserEntity handleException(String id, BlockException ex) {
        ex.printStackTrace();
        return new UserEntity("流控！");
    }

    /**
     * 定义流控规则
     *
     * spring初始化加载
     */
    @PostConstruct
    private static void initFlowRules() {
        List<FlowRule> rules = new ArrayList<>();
        FlowRule rule = new FlowRule();
        //设置受保护的资源
        rule.setResource(RESOURCE_NAME);

        // 设置流控规则 QPS
        rule.setGrade(RuleConstant.FLOW_GRADE_QPS);
        // 设置受保护的资源阈值
        // Set limit QPS to 20.
        rule.setCount(1);
        rules.add(rule);
        // 加载配置好的规则
        FlowRuleManager.loadRules(rules);
    }
}
