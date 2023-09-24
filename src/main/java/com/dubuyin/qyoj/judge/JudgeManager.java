package com.dubuyin.qyoj.judge;

import com.dubuyin.qyoj.judge.strategy.DefaultJudgeStrategy;
import com.dubuyin.qyoj.judge.strategy.JavaLanguageJudgeStrategy;
import com.dubuyin.qyoj.judge.strategy.JudgeContext;
import com.dubuyin.qyoj.judge.strategy.JudgeStrategy;
import com.dubuyin.qyoj.judge.codesandbox.model.JudgeInfo;
import com.dubuyin.qyoj.model.entity.QuestionSubmit;
import org.springframework.stereotype.Service;

/**
 * 判题管理（简化调用）
 */
@Service
public class JudgeManager {

    /**
     * 执行判题
     *
     * @param judgeContext
     * @return
     */
    JudgeInfo doJudge(JudgeContext judgeContext) {
        QuestionSubmit questionSubmit = judgeContext.getQuestionSubmit();
        String language = questionSubmit.getLanguage();
        JudgeStrategy judgeStrategy = new DefaultJudgeStrategy();
        if ("java".equals(language)) {
            judgeStrategy = new JavaLanguageJudgeStrategy();
        }
        return judgeStrategy.doJudge(judgeContext);
    }

}
