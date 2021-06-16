package example.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultRestController {

  private static final Log LOGGER = LogFactory.getLog(DefaultRestController.class);

  @RequestMapping(value = "/all")
  public String available() {
    LOGGER.info("hello splunk");
    return "Spring in Action";
  }
}
