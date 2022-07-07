package Test_Scripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import Generic.Base_Test;
import Generic.Read;
import Pom_Scriptts.Pom_class;

public class Login extends Base_Test
{
@Test
public void test() throws EncryptedDocumentException, IOException	
{
		String username=Read.getData("Sheet1",0,0);
		String password=Read.getData("Sheet1",0,1);
		Pom_class pmc=new Pom_class(driver);
		pmc.Username(username);
		pmc.Password(password);
		Assert.fail();
		pmc.ClickLogin();
		
}

}
