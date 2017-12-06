package ua.core.data;

import java.util.EnumSet;
import java.util.List;

import ua.core.enums.Case;
import ua.core.utils.StringUtils;

/**
 * Converts a string into different cases and forms.
 * 
 * @author Tadhg
 *
 */
public class CaseString {

    private final String value;
    private final List<String> words;

    public CaseString (String value) {

        if (value == null) {
            throw new NullPointerException ("value - null not allowed.");
        }

        this.value = value;
        this.words = StringUtils.toWords (value);
    }

    public String getValue() {
        return value;
    }

    public List<String> getWords() {
        return words;
    }

    public String camelCase() {
        return StringUtils.to1stLowerCase (value);
    }

    public String camelHyphenCase() {
        return StringUtils.toCase (words, EnumSet.of (Case.CAMEL, Case.HYPHEN));
    }

    public String camelSnakeCase() {
    		return StringUtils.toCase (words, EnumSet.of (Case.CAMEL, Case.SNAKE));
    }

    public String lowerCase() {
        return StringUtils.toLowerCase (value);
    }

    public String lowerHyphenCase() {
    		return StringUtils.toCase (words, EnumSet.of (Case.LOWER, Case.HYPHEN));
    }

    public String lowerSnakeCase() {
    		return StringUtils.toCase (words, EnumSet.of (Case.LOWER, Case.SNAKE));
    }

    public String titleCase() {
        return StringUtils.to1stUpperCase (value);
    }

    public String titleHyphenCase() {
    		return StringUtils.toCase (words, EnumSet.of (Case.TITLE, Case.HYPHEN));
    }

    public String titleSnakeCase() {
    		return StringUtils.toCase (words, EnumSet.of (Case.TITLE, Case.SNAKE));
    }

    public String upperCase() {
        return StringUtils.toUpperCase (value);
    }

    public String upperHyphenCase() {
    		return StringUtils.toCase (words, EnumSet.of (Case.UPPER, Case.HYPHEN));
    }

    public String upperSnakeCase() {
    		return StringUtils.toCase (words, EnumSet.of (Case.UPPER, Case.SNAKE));
    }
    
    public String value() {
    		return value;
    }

    @Override
    public String toString() {
        return "TextForm [" +
            "value=" + ((value != null) ? "\"" + value + "\"" : "null") +
            "]";
    }
}