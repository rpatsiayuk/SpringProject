package com.spring.logger;

import com.spring.interfaces.EventLogger;

public class ConsoleEventLogger implements EventLogger {

   public void logEvent(String msg){
        System.out.println(msg);
    }
}