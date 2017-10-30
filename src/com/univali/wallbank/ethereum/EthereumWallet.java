/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.univali.wallbank.ethereum;

import com.univali.wallbank.factory.Client;
import com.univali.wallbank.factory.Coin;
import com.univali.wallbank.factory.WalletFactory;

/**
 *
 * @author 6182593
 */
public class EthereumWallet implements WalletFactory{

    @Override
    public Coin createCoin() {
        return null;
    }

    @Override
    public Client createClient() {
        return null;
    }
    
}
