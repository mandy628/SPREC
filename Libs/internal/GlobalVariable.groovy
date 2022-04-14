package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p>Profile default : &#39033;&#30446;&#21517;&#31216;</p>
     */
    public static Object proname
     
    /**
     * <p>Profile default : &#30331;&#24405;&#21517;</p>
     */
    public static Object loginanme
     
    /**
     * <p>Profile default : &#22320;&#22336;</p>
     */
    public static Object url
     
    /**
     * <p>Profile default : &#25346;&#29260;&#26085;&#26399;</p>
     */
    public static Object gpdate
     
    /**
     * <p>Profile default : &#20010;&#20154;&#38376;&#25143;&#30331;&#24405;&#21517;</p>
     */
    public static Object perloginname
     
    /**
     * <p>Profile default : &#20010;&#20154;&#38376;&#25143;&#23458;&#25143;&#21517;&#31216;</p>
     */
    public static Object perusername
     
    /**
     * <p>Profile default : &#20010;&#20154;&#38376;&#25143;&#30331;&#24405;&#23494;&#30721;</p>
     */
    public static Object loginpwd
     
    /**
     * <p>Profile default : &#20132;&#26131;&#31995;&#32479;&#30331;&#24405;&#23494;&#30721;</p>
     */
    public static Object loginpwdgl
     
    /**
     * <p>Profile default : &#31995;&#32479;&#40664;&#35748;&#25163;&#26426;&#39564;&#35777;&#30721;</p>
     */
    public static Object syyanzhengma
     
    /**
     * <p>Profile default : &#20132;&#26131;&#21592;&#30331;&#24405;&#21517;</p>
     */
    public static Object loginname_jyy
     
    /**
     * <p>Profile default : &#31995;&#32479;&#40664;&#35748;&#25163;&#26426;&#39564;&#35777;&#30721;</p>
     */
    public static Object loginpwd_jyy
     
    /**
     * <p>Profile default : firefox &#37197;&#32622;&#25991;&#20214;</p>
     */
    public static Object G_FFProfile
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += TestCaseMain.getParsedValues(RunConfiguration.getOverridingParameters())
    
            proname = selectedVariables['proname']
            loginanme = selectedVariables['loginanme']
            url = selectedVariables['url']
            gpdate = selectedVariables['gpdate']
            perloginname = selectedVariables['perloginname']
            perusername = selectedVariables['perusername']
            loginpwd = selectedVariables['loginpwd']
            loginpwdgl = selectedVariables['loginpwdgl']
            syyanzhengma = selectedVariables['syyanzhengma']
            loginname_jyy = selectedVariables['loginname_jyy']
            loginpwd_jyy = selectedVariables['loginpwd_jyy']
            G_FFProfile = selectedVariables['G_FFProfile']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
