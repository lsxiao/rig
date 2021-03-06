package rule.length;

import com.lsxiao.rig.core.rule.BaseRule;
import com.lsxiao.rig.core.rule.ParamAble;
import com.lsxiao.rig.core.rule.length.LengthRule;

import junit.framework.TestCase;

public class LengthRuleTest extends TestCase {
    private LengthRule mLengthRule;

    @Override
    public void setUp() throws Exception {
        mLengthRule = new LengthRule(new String[]{"3"});
    }

    public void testName() throws Exception {
        assertTrue(LengthRule.Companion.getNames().contains("length"));
    }

    public void testClass() throws Exception {
        assertTrue(BaseRule.class.isAssignableFrom(LengthRule.class));
        assertTrue(ParamAble.class.isAssignableFrom(LengthRule.class));
    }

    public void testParameters() throws Exception {
        assertTrue(mLengthRule.getParams().length == 1);
        assertSame(mLengthRule.getParams()[0], "3");
        assertNotNull(mLengthRule.getParams());
        assertTrue(mLengthRule.checkParams());

        assertFalse(new LengthRule(new String[]{}).checkParams());
        assertFalse(new LengthRule(new String[]{""}).checkParams());
        assertFalse(new LengthRule(new String[]{"ab"}).checkParams());
        assertFalse(new LengthRule(new String[]{"abcd"}).checkParams());
    }

    public void testRule() throws Exception {
        assertFalse(mLengthRule.check(""));
        assertFalse(mLengthRule.check("a"));
        assertFalse(mLengthRule.check("ab"));
        assertTrue(mLengthRule.check("abc"));
        assertFalse(mLengthRule.check("abcd"));
        assertFalse(mLengthRule.check("abcde"));
        assertFalse(mLengthRule.check("abcdef"));
    }
}
