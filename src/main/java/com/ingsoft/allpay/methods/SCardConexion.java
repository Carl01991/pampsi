package com.ingsoft.allpay.methods;

import java.util.List;

import javax.smartcardio.Card;
import javax.smartcardio.CardChannel;
import javax.smartcardio.CardException;
import javax.smartcardio.CardTerminal;
import javax.smartcardio.ATR;
import javax.smartcardio.CommandAPDU;
import javax.smartcardio.ResponseAPDU;
import javax.smartcardio.TerminalFactory;
 
/**
* Clase que maneja las conexiones PC/SC
*
* @version 2.0 Marzo de 2014
* @author Julio Chinchilla
*/
public class SCardConexion  {
 
    private Card card = null;
    private CardChannel channel = null;    

    public synchronized List<CardTerminal> terminals () throws CardException {
        TerminalFactory factory = TerminalFactory.getDefault();
        return factory.terminals().list();
    }
 

    public synchronized ATR connect (int t, String protocol) throws CardException {
        CardTerminal terminal = this.terminals().get(t);
        card = terminal.connect(protocol);
        card.beginExclusive();
        channel = card.getBasicChannel();
        return card.getATR();
    }
 

    public synchronized ResponseAPDU transmit (CommandAPDU apdu) throws CardException {
        return channel.transmit(apdu);
    }
 

    public synchronized void disconnect () throws CardException {
        card.endExclusive();
        card.disconnect(true);
    }    
 
}