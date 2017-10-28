/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.univali.wallbank.factory;

/**
 *
 * @author wachsmann
 */
public interface WalletFactory {
    Coin createCoin();
    Client createClient();
}
