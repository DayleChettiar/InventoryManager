package com.dayle.springapp;
import java.util.Map;

import org.springframework.web.servlet.ModelAndView;
import com.dayle.service.SimpleProductManager;
import com.dayle.springapp.InventoryController;

import junit.framework.TestCase;

public class InventoryControllerTests extends TestCase {

    public void testHandleRequestView() throws Exception{		
        InventoryController controller = new InventoryController();
        controller.setProductManager(new SimpleProductManager());
        ModelAndView modelAndView = controller.handleRequest(null, null);		
        assertEquals("hello", modelAndView.getViewName());
        assertNotNull(modelAndView.getModel());
        Map modelMap = (Map) modelAndView.getModel().get("model");
        String nowValue = (String) modelMap.get("serverTime");
        assertNotNull(nowValue);
    }
}