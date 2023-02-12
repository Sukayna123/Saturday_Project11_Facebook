package Project11Facebook;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FillTheFormWithInvalidCredentials {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        //"1-Navigate to facebook page http://www.Facebook.com
        driver.get("https://www.facebook.com/");
        //2-Click on create a new button
        //<a role="button" class="_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy" href="#" ajaxify="/reg/spotlight/"
        // id="u_0_0_5J" data-testid="open-registration-form-button" rel="async">Create new account</a>
        WebElement createNewAccount= driver.findElement(By.linkText("Create new account"));
        createNewAccount.click();
        //3-Fill the form with invalid information
      //<div id="reg_box" class="registration_redesign"><div class="_8fgl _9l2p"><div id="reg_error" class="hidden_elem _58mn" role="alert"><div
        // class="_58mo" id="reg_error_inner" tabindex="0">An error occurred. Please try again.</div></div><div id="softblock_error" class="hidden_elem _58mn" role="alert"><div class="_58mo" id="softblock_error_inner" tabindex="0">We Couldn't Create Your Account<br>We were not able to sign you up for Facebook.</div></div><form method="post" id="reg" name="reg" action="https://m.facebook.com/reg/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjc2MTc4NTE2LCJjYWxsc2l0ZV9pZCI6MjY5NTQ4NDUzMDcyMDk1MX0%3D" onsubmit="return false;"><input type="hidden" name="jazoest" value="2938" autocomplete="off"><input type="hidden" name="lsd" value="AVoJbg3aTPY" autocomplete="off"><div id="reg_form_box" class="large_form"><div id="fullname_field" class="_1ixn"><div class="clearfix _58mh"><div class="mbm _1iy_ _a4y _3-90 lfloat _ohe"><div class="_5dbb _5634" id="u_x_a_tf"><div class="uiStickyPlaceholderInput uiStickyPlaceholderEmptyInput"><div class="placeholder" aria-hidden="true">First name</div><input type="text" class="inputtext _58mg _5dba _2ph-" data-type="text" name="firstname" value="" aria-required="true" placeholder="" aria-label="First name" id="u_x_b_O9" tabindex="0" aria-describedby="js_100"></div><i class="_5dbc img sp_98fCI7IVTTz sx_54513f"></i><i class="_5dbd img sp_98fCI7IVTTz sx_336c7a"></i><div class="_1pc_"></div></div></div><div class="mbm _1iy_ _a4y rfloat _ohf"><div class="_5dbb" id="u_x_c_61"><div class="uiStickyPlaceholderInput uiStickyPlaceholderEmptyInput"><div class="placeholder" aria-hidden="true">Last name</div><input type="text" class="inputtext _58mg _5dba _2ph-" data-type="text" name="lastname" value="" aria-required="true" placeholder="" aria-label="Last name" id="u_x_d_KU"></div><i class="_5dbc img sp_98fCI7IVTTz sx_54513f"></i><i class="_5dbd img sp_98fCI7IVTTz sx_336c7a"></i><div class="_1pc_"></div></div></div></div><div class="_1pc_" id="fullname_error_msg"></div></div><div class="mbm _a4y" id="u_x_e_Eg"><div class="_5dbb" id="u_x_f_UX"><div class="uiStickyPlaceholderInput uiStickyPlaceholderEmptyInput"><div class="placeholder" aria-hidden="true">Mobile number or email</div><input type="text" class="inputtext _58mg _5dba _2ph-" data-type="text" name="reg_email__" value="" aria-required="true" placeholder="" aria-label="Mobile number or email" id="u_x_g_re"></div><i class="_5dbc img sp_98fCI7IVTTz sx_54513f"></i><i class="_5dbd img sp_98fCI7IVTTz sx_336c7a"></i><div class="_1pc_"></div></div></div><div class="hidden_elem" id="u_x_h_Lc" style="opacity: 1e-05;"><div class="mbm _a4y"><div class="_5dbb" id="u_x_i_AN"><div class="uiStickyPlaceholderInput uiStickyPlaceholderEmptyInput"><div class="placeholder" aria-hidden="true">Re-enter email</div><input type="text" class="inputtext _58mg _5dba _2ph-" data-type="text" name="reg_email_confirmation__" value="" aria-required="true" placeholder="" aria-label="Re-enter email" id="u_x_j_vp"></div><i class="_5dbc img sp_98fCI7IVTTz sx_54513f"></i><i class="_5dbd img sp_98fCI7IVTTz sx_336c7a"></i><div class="_1pc_"></div></div></div></div><div class="mbm _br- _a4y" id="password_field"><div class="_5dbb" id="u_x_k_1g"><div class="uiStickyPlaceholderInput uiStickyPlaceholderEmptyInput"><div class="placeholder" aria-hidden="true">New password</div><input type="password" class="inputtext _58mg _5dba _2ph-" data-type="password" autocomplete="new-password" name="reg_passwd__" id="password_step_input" aria-required="true" placeholder="" aria-label="New password"></div><i class="_5dbc img sp_98fCI7IVTTz sx_54513f"></i><i class="_5dbd img sp_98fCI7IVTTz sx_336c7a"></i><div class="_1pc_"></div></div></div><div class="_58mq _5dbb" id="birthday_wrapper"><div class="mtm mbs _2_68">Birthday<a class="_58ms mlm" id="birthday-help" href="#" title="Click for more information" role="button"><i class="img sp_98fCI7IVTTz sx_c4643a"></i></a></div><div class="_5k_5"><span class="_5k_4" data-type="selectors" data-name="birthday_wrapper" id="u_x_l_xO"><span><select aria-label="Month" name="birthday_month" id="month" title="Month" class="_9407 _5dba _9hk6 _8esg"><option value="1">Jan</option><option value="2" selected="1">Feb</option><option value="3">Mar</option><option value="4">Apr</option><option value="5">May</option><option value="6">Jun</option><option value="7">Jul</option><option value="8">Aug</option><option value="9">Sep</option><option value="10">Oct</option><option value="11">Nov</option><option value="12">Dec</option></select><select aria-label="Day" name="birthday_day" id="day" title="Day" class="_9407 _5dba _9hk6 _8esg"><option value="1">1</option><option value="2">2</option><option value="3">3</option><option value="4">4</option><option value="5">5</option><option value="6">6</option><option value="7">7</option><option value="8">8</option><option value="9">9</option><option value="10">10</option><option value="11" selected="1">11</option><option value="12">12</option><option value="13">13</option><option value="14">14</option><option value="15">15</option><option value="16">16</option><option value="17">17</option><option value="18">18</option><option value="19">19</option><option value="20">20</option><option value="21">21</option><option value="22">22</option><option value="23">23</option><option value="24">24</option><option value="25">25</option><option value="26">26</option><option value="27">27</option><option value="28">28</option><option value="29">29</option><option value="30">30</option><option value="31">31</option></select><select aria-label="Year" name="birthday_year" id="year" title="Year" class="_9407 _5dba _9hk6 _8esg"><option value="2023" selected="1">2023</option><option value="2022">2022</option><option value="2021">2021</option><option value="2020">2020</option><option value="2019">2019</option><option value="2018">2018</option><option value="2017">2017</option><option value="2016">2016</option><option value="2015">2015</option><option value="2014">2014</option><option value="2013">2013</option><option value="2012">2012</option><option value="2011">2011</option><option value="2010">2010</option><option value="2009">2009</option><option value="2008">2008</option><option value="2007">2007</option><option value="2006">2006</option><option value="2005">2005</option><option value="2004">2004</option><option value="2003">2003</option><option value="2002">2002</option><option value="2001">2001</option><option value="2000">2000</option><option value="1999">1999</option><option value="1998">1998</option><option value="1997">1997</option><option value="1996">1996</option><option value="1995">1995</option><option value="1994">1994</option><option value="1993">1993</option><option value="1992">1992</option><option value="1991">1991</option><option value="1990">1990</option><option value="1989">1989</option><option value="1988">1988</option><option value="1987">1987</option><option value="1986">1986</option><option value="1985">1985</option><option value="1984">1984</option><option value="1983">1983</option><option value="1982">1982</option><option value="1981">1981</option><option value="1980">1980</option><option value="1979">1979</option><option value="1978">1978</option><option value="1977">1977</option><option value="1976">1976</option><option value="1975">1975</option><option value="1974">1974</option><option value="1973">1973</option><option value="1972">1972</option><option value="1971">1971</option><option value="1970">1970</option><option value="1969">1969</option><option value="1968">1968</option><option value="1967">1967</option><option value="1966">1966</option><option value="1965">1965</option><option value="1964">1964</option><option value="1963">1963</option><option value="1962">1962</option><option value="1961">1961</option><option value="1960">1960</option><option value="1959">1959</option><option value="1958">1958</option><option value="1957">1957</option><option value="1956">1956</option><option value="1955">1955</option><option value="1954">1954</option><option value="1953">1953</option><option value="1952">1952</option><option value="1951">1951</option><option value="1950">1950</option><option value="1949">1949</option><option value="1948">1948</option><option value="1947">1947</option><option value="1946">1946</option><option value="1945">1945</option><option value="1944">1944</option><option value="1943">1943</option><option value="1942">1942</option><option value="1941">1941</option><option value="1940">1940</option><option value="1939">1939</option><option value="1938">1938</option><option value="1937">1937</option><option value="1936">1936</option><option value="1935">1935</option><option value="1934">1934</option><option value="1933">1933</option><option value="1932">1932</option><option value="1931">1931</option><option value="1930">1930</option><option value="1929">1929</option><option value="1928">1928</option><option value="1927">1927</option><option value="1926">1926</option><option value="1925">1925</option><option value="1924">1924</option><option value="1923">1923</option><option value="1922">1922</option><option value="1921">1921</option><option value="1920">1920</option><option value="1919">1919</option><option value="1918">1918</option><option value="1917">1917</option><option value="1916">1916</option><option value="1915">1915</option><option value="1914">1914</option><option value="1913">1913</option><option value="1912">1912</option><option value="1911">1911</option><option value="1910">1910</option><option value="1909">1909</option><option value="1908">1908</option><option value="1907">1907</option><option value="1906">1906</option><option value="1905">1905</option></select></span></span><i class="_5dbc _5k_6 img sp_98fCI7IVTTz sx_54513f"></i><i class="_5dbd _5k_7 img sp_98fCI7IVTTz sx_336c7a"></i><div class="_1pc_"></div></div></div><div class="_58mq _5dbb hidden_elem" id="birthday_age"><div class="mtm mbs _2_68">Age</div><div class="_5k_5"><span class="_5k_4 _58mh" data-type="text" data-name="birthday_wrapper"><div class="uiStickyPlaceholderInput uiStickyPlaceholderEmptyInput"><div class="placeholder" aria-hidden="true">Your age</div><input type="text" class="inputtext _58mg _5dba _2ph-" data-type="text" name="birthday_age" placeholder="" aria-label="Your age" id="u_x_m_kH"></div><a class="_8g_s" id="age_to_birthday_link" href="#" role="button">Use date of birth</a></span><i class="_5dbc _5k_6 img sp_98fCI7IVTTz sx_54513f"></i><i class="_5dbd _5k_7 img sp_98fCI7IVTTz sx_336c7a"></i><div class="_1pc_"></div></div><input type="hidden" autocomplete="off" name="did_use_age" value=""></div><div class="mtm _5wa2 _5dbb" id="u_x_n_8P"><div class="mtm mbs _2_68">Gender<a class="_58ms mlm" aria-label="" id="gender-help" title="Click for more information" href="#" role="button"><i class="img sp_98fCI7IVTTz sx_c4643a"></i></a></div><span class="_5k_3" data-type="radio" data-name="gender_wrapper" id="u_x_o_IZ"><span class="_5k_2 _5dba"><label class="_58mt" for="u_x_4_2w">Female</label><input type="radio" class="_8esa" name="sex" value="1" id="u_x_4_2w"></span><span class="_5k_2 _5dba"><label class="_58mt" for="u_x_5_F2">Male</label><input type="radio" class="_8esa" name="sex" value="2" id="u_x_5_F2"></span><span class="_5k_2 _5dba"><label class="_58mt" for="u_x_6_GH">Custom</label><input type="radio" class="_8esa" name="sex" value="-1" id="u_x_6_GH"></span></span><i class="_5dbc _8esb img sp_98fCI7IVTTz sx_54513f"></i><i class="_5dbd _8esc img sp_98fCI7IVTTz sx_336c7a"></i><div class="_1pc_"></div></div><div class="mtm _8ffv hidden_elem" id="custom_gender_container"><div class="_17ie _5dbb" data-type="selectors" data-name="preferred_pronoun" id="u_x_p_G8"><select aria-label="Select your pronoun" name="preferred_pronoun" class="_7-16 _9hk6 _5dba _9m5o"><option selected="1" value="" disabled="1">Select your pronoun</option><option value="1">She: "Wish her a happy birthday!"</option><option value="2">He: "Wish him a happy birthday!"</option><option value="6">They: "Wish them a happy birthday!"</option></select><i class="mrm _5dbc _8esb img sp_98fCI7IVTTz sx_54513f"></i></div><div class="_83kf">Your pronoun is visible to everyone.</div><div class="_7-1q"><div class="uiStickyPlaceholderInput uiStickyPlaceholderEmptyInput"><div class="placeholder" aria-hidden="true">Gender (optional)</div><input type="text" class="inputtext _58mg _5dba _2ph-" data-type="text" name="custom_gender" placeholder="" aria-label="Gender (optional)" id="u_x_q_IX"></div></div><div class="_1pc_"></div></div><div class="_58mu" data-nocookies="1"><p class="_58mv">People who use our service may have uploaded your contact information to Facebook. <a href="/help/637205020878504" id="non-users-notice-link" target="_blank" rel="nofollow">Learn more</a>.</p></div><div class="_58mu" data-nocookies="1" id="u_x_r_P8"><p class="_58mv">By clicking Sign Up, you agree to our <a href="/legal/terms/update" id="terms-link" target="_blank" rel="nofollow">Terms</a>, <a href="/about/privacy/update" id="privacy-link" target="_blank" rel="nofollow">Privacy Policy</a> and <a href="/policies/cookies/" id="cookie-use-link" target="_blank" rel="nofollow">Cookies Policy</a>. You may receive SMS Notifications from us and can opt out any time.</p></div><div class="_1lch"><button type="submit" class="_6j mvm _6wk _6wl _58mi _6o _6v" name="websubmit" id="u_x_s_nd">Sign Up</button><span class="hidden_elem _58ml" id="u_x_t_iF"><img class="img" src="https://static.xx.fbcdn.net/rsrc.php/v3/yb/r/GsNJNwuI-UM.gif" alt="" width="16" height="11"></span></div></div><input type="hidden" autocomplete="off" id="referrer" name="referrer" value=""><input type="hidden" autocomplete="off" id="asked_to_login" name="asked_to_login" value="0"><input type="hidden" autocomplete="off" id="use_custom_gender" name="use_custom_gender" value=""><input type="hidden" autocomplete="off" id="terms" name="terms" value="on"><input type="hidden" autocomplete="off" id="ns" name="ns" value="0"><input type="hidden" autocomplete="off" id="ri" name="ri" value="376534d0-cd0f-4345-a1ea-f1d96619e9b2"><input type="hidden" autocomplete="off" id="action_dialog_shown" name="action_dialog_shown" value=""><input type="hidden" autocomplete="off" id="ignore" name="ignore" value="reg_email_confirmation__"><input type="hidden" autocomplete="off" id="locale" name="locale" value="en_US"><input type="hidden" autocomplete="off" id="reg_instance" name="reg_instance" value="_I1MY4Y3v9pxcaSS63uoWt8Y"><div id="reg_captcha" class="_58mw hidden_elem"><div><h2 id="security_check_header">Security check</h2><div id="outer_captcha_box"><div id="captcha_box"><div class="field_error hidden_elem" id="captcha_response_error">This field is required.</div><div id="captcha" class="captcha" data-captcha-class="ReCaptchav2Captcha"><input type="hidden" autocomplete="off" id="captcha_persist_data" name="captcha_persist_data" value="AZkrw36D3yBeYZoi8np5VOe5IxC5mg_t3Ioas-2ZHtp7JnC8usfOOmJhR4SFAdi5uaSJqAk2bcAc4ZQg17-PVYLIJfUZ3EQQwP7B3Zf41zxjHCLWqy15zwkYJC6msyKQnu3kNTWaOYhfQMUvjIqA3r_10RQZE48SExKLB21Ha3-6TTfgsXKolRB25roUEAzUm14foTwpjcrHIFJ4z4CcuXcd97Xt14v-R1qubcasrROSai1oSivsoElLftx6IuzoTY6BEgD3V4xmifT9lLDtyp8CjekgEmQ5cy2Ue4tBBBZpHL3_yp4Ml__3o7qQDVWsW_J8n62wk2IZtKuvH7MbRx2O-qQhBKYkk3cbZikUFM_JyvBTj8pW0_GKYne41hCXcjI"><div><input name="captcha_response" id="captcha_response" type="hidden"><iframe id="captcha-recaptcha" class="_3-8x _3-95" width="100%" height="90px" scrolling="no" frameborder="0" src="/common/referer_frame.php?no_lower=false" style="height: 0px;"></iframe></div><div class="captcha_input"><a href="#" onclick="CSS.show($('captcha_whats_this')); return false;" role="button">Why am I seeing this?</a><div id="captcha_whats_this" class="hidden_elem"><div class="fsl fwb">Security check</div>This is a standard security test that we use to prevent spammers from sending automated requests.</div></div></div></div></div><div id="captcha_buttons" class="_58p2 clearfix hidden_elem"><div class="_58mx _58mm"><div class="_58mz"> &nbsp; </div><a class="_58my" href="#" role="button" id="u_x_u_bm">Back</a></div><div class="_58mm"><div class="clearfix"><button type="submit" class="_6j mvm _6wk _6wl _58me _58mi _6o _6v" id="u_x_v_0R">Sign Up</button><span class="hidden_elem _58ml" id="u_x_w_Rd"><img class="img" src="https://static.xx.fbcdn.net/rsrc.php/v3/yb/r/GsNJNwuI-UM.gif" alt="" width="16" height="11"></span></div></div></div></div></div></form></div><div id="reg_pages_msg" class="_58mk hidden_elem"><a
        // href="/pages/create/?ref_type=registration_form" class="_8esh">Create a Page</a> for a celebrity, brand or business.</div></div>
        //WebElement firstname=driver.findElement(By.cssSelector("reg_box[class='_58mo']"));
      //  firstname.sendKeys("12345");


        //4-Choose gender as Custom
        //<span class="_5k_3" data-type="radio" data-name="gender_wrapper" id="u_4_o_D9"><span class="_5k_2 _5dba"><label class="_58mt" for="u_4_4_0Y">Female</label><input type="radio" class="_8esa" name="sex" value="1" id="u_4_4_0Y"></span><span class="_5k_2 _5dba"><label class="_58mt" for="u_4_5_PB">Male</label><input type="radio" class="_8esa" name="sex" value="2" id="u_4_5_PB"></span><span class="_5k_2 _5dba"><label class="_58mt"
        // for="u_4_6_/+">Custom</label><input type="radio" class="_8esa" name="sex" value="-1" id="u_4_6_/+"></span></span>
//<input type="radio" class="_8esa" name="sex" value="-1" id="u_4_6_/+">
        WebElement gender=driver.findElement(By.cssSelector("#span"));
        gender.click();

    }
}
