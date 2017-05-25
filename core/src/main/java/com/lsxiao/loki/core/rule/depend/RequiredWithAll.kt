package com.lsxiao.loki.core.rule.depend

import com.lsxiao.loki.core.rule.Rule

/**
 * write with Loki
 * author:lsxiao
 * date:2017-05-25 22:48
 * github:https://github.com/lsxiao
 * zhihu:https://zhihu.com/people/lsxiao
 */

class RequiredWithAll : Rule() {
    override val name = "requiredWithAll"

    override fun hasParameter() = true

    override fun isParameterValid(): Boolean {
        return parameters.isNotEmpty()
    }

    override fun validate(data: String): Boolean {
        return parameters.all { it.isNotEmpty() } && data.isNotEmpty()
    }
}