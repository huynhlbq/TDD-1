package com.kata.bankaccount.model;

import java.util.Calendar;

/**
 * User: Tu
 * Date: 7/24/13
 */
public class Transaction
{
    private String accountNumber;
    private Calendar timeStamp;
    private double amount;
    private String description;

    public String getAccountNumber()
    {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber)
    {
        this.accountNumber = accountNumber;
    }

    public Calendar getTimeStamp()
    {
        return timeStamp;
    }

    public void setTimeStamp(Calendar timeStamp)
    {
        this.timeStamp = timeStamp;
    }

    public double getAmount()
    {
        return amount;
    }

    public void setAmount(double amount)
    {
        this.amount = amount;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }
}
