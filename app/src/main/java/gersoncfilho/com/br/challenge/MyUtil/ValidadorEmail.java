package gersoncfilho.com.br.challenge.MyUtil;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by gersoncardoso on 29/09/2016.
 */

public class ValidadorEmail {


    private static Pattern pattern;
    private static Matcher matcher;

    private static String email;

    private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\\\+]+(\\\\.[_A-Za-z0-9-]+)*\n" +
            "      @[A-Za-z0-9-]+(\\\\.[A-Za-z0-9]+)*(\\\\.[A-Za-z]{2,})$;";


    public ValidadorEmail()
    {
        pattern = Pattern.compile(EMAIL_PATTERN);
    }

    /**
     *
     * @param email recebe string email
     * @return boolean true se o email for válido e false se o email for inválido
     */
    public boolean validaEmail(final String email) {

        matcher = pattern.matcher(email);
        return matcher.matches();

    }

}
