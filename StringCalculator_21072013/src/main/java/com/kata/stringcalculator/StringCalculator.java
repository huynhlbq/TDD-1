package com.kata.stringcalculator;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * User: Tu
 * Date: 7/21/13
 */
public class StringCalculator
{
    private static final String DEFAULT_DELIMITER = ",|\n";
    private static final String DELIMITER_PATTERN = "//((.)|(\\[.*\\])*)\\n";
    private static final String CUSTOMIZED_DELIMITER_INDICATOR = "//";
    private static final Integer MAX_VALUE = 1000;

    public int add(String numbers) throws Exception
    {
        if (numbers.isEmpty())
        {
            return 0;
        }
        else
        {
            String[] arrayNumber = tokenizer(numbers);
            List<Integer> negativeNumber = new ArrayList<Integer>();
            int total = 0;
            int temp;
            for (int i = 0; i < arrayNumber.length; i++)
            {
                temp = string2IntConverter(arrayNumber[i]);
                if (temp < 0)
                {
                    negativeNumber.add(temp);
                }
                else if (temp > MAX_VALUE)
                {
                    //do nothing
                }
                else
                {
                    total += temp;
                }
            }
            if (negativeNumber.size() > 0)
            {
                throw new Exception("negatives not allowed " + listToString(negativeNumber));
            }
            return total;
        }
    }

    private String listToString(List<Integer> source)
    {
        String target = "";
        for (Integer i : source)
        {
            target += i + " ";
        }
        return target;
    }

    private int string2IntConverter(String numbers) throws NumberFormatException
    {
        return Integer.parseInt(numbers);
    }

    private String[] tokenizer(String numbers)
    {
        if (numbers.startsWith(CUSTOMIZED_DELIMITER_INDICATOR))
        {
            return splitCustomizableDelimiters(numbers);
        }
        return numbers.split(DEFAULT_DELIMITER);
    }

    private String[] splitCustomizableDelimiters(String numbers)
    {
        Pattern p = Pattern.compile(DELIMITER_PATTERN);
        Matcher m = p.matcher(numbers);
        String delimiters = "";
        StringBuilder tString = new StringBuilder(numbers);
        String[] arrDelimiters = new String[0];
        if (m.find())
        {
            tString.delete(0, tString.length());
            tString.append(numbers.replace(m.group(0), ""));
            delimiters = m.group(1);
            if (delimiters.length() > 1)
            {
                delimiters = delimiters.substring(1, delimiters.length() - 1);
            }
            arrDelimiters = delimiters.split("\\]\\[");
        }
        String toSplit = "";
        for (int i = 0; i < arrDelimiters.length; i++)
        {
            toSplit += Pattern.quote(arrDelimiters[i]) + "|";

        }
        return tString.toString().split(toSplit.substring(0,toSplit.length()-1));
    }
}
