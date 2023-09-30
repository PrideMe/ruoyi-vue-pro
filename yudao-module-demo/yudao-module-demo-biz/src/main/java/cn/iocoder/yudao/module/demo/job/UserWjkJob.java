package cn.iocoder.yudao.module.demo.job;

import cn.hutool.core.date.DateUtil;
import cn.iocoder.yudao.framework.quartz.core.handler.JobHandler;
import cn.iocoder.yudao.framework.tenant.core.job.TenantJob;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class UserWjkJob implements JobHandler {
    @Override
    @TenantJob // 标记多租户
    public String execute(String param) throws Exception {
        System.out.println("定时任务王吉凯");
        return DateUtil.now();
    }
}
