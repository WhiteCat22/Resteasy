package org.jboss.resteasy.test.resteasy_jaxrs.i18n;

import java.util.Locale;

/**
 * 
 * @author <a href="ron.sigal@jboss.com">Ron Sigal</a>
 * @version $Revision: 1.1 $
 * 
 * Copyright Sep 27, 2014
 */
public class TestMessages_xx_YY extends TestMessagesAbstract
{  
   @Override
   protected Locale getLocale()
   {
      return new Locale("xx", "YY");
   }
}
