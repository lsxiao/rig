package com.lsxiao.loki.core.rule.other

import com.lsxiao.loki.core.rule.LokiRule

/**
 * write with LokiRule
 * author:lsxiao
 * date:2017-05-25 22:48
 * github:https://github.com/lsxiao
 * zhihu:https://zhihu.com/people/lsxiao
 */

class RegExpRule : LokiRule() {
    companion object {
        val name = "reg"
    }

    override fun hasParameters() = false

    override fun validateParameters() = false

    override fun validate(data: String?): Boolean {
        return data != null
    }
}
