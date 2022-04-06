package org.robust.springCucumber.cucumber;

import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
                                                    //More details on Eclipse for Component
@Component                          //To Autowire this Class to any other Class 'Component' is used
@PropertySource({"classpath:config/runconfiguration.properties"})
public class ConfigLoad {           //Purpose of this class is to load the Configurations



}
