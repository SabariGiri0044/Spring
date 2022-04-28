package com.mrsabu;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration  //tells spring this is configuration class  //define here Componenet-scan
@ComponentScan(basePackages="com.mrsabu")  //spring from this packages
public class Myconfig {

}
