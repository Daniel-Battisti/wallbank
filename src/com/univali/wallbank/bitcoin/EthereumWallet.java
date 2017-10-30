/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.univali.wallbank.bitcoin;

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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Client createClient() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
