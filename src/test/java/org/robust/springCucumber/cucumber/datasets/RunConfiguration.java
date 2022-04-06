package org.robust.springCucumber.cucumber.datasets;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data                                           //Data from Lombok
public class RunConfiguration {

    @Value("${browser}")                        //Value from spring framework
    private String browser;

//    @Value("${browser:ie}")             if don't have browser defined in ur properties file, till it will take
//    private String browser;               browser and will put it's value as ie

    @Value("${testType}")
    private String testType;


}



//Due to Lombok here we don't need Getters & Setters methods for the private members