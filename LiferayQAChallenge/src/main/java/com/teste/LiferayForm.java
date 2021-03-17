package com.teste;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LiferayForm {
	
	
@Test
public void EnglishForm() throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://forms.liferay.com/web/forms/shared/-/form/122548");
	Assert.assertEquals("This is a Liferay Forms", driver.getTitle());
	driver.manage().window().maximize();

//botao calendario
	driver.findElement(By.xpath("//div//input[@class='form-control input-group-inset input-group-inset-after']"))
			.click();
	driver.findElement(By.xpath("//div//input[@class='form-control input-group-inset input-group-inset-after']"))
			.clear();
	driver.findElement(By.xpath("//div//input[@class='form-control input-group-inset input-group-inset-after']"))
			.sendKeys("10/03/2021");
	Thread.sleep(2000);

//Inserção do nome
	driver.findElement(By.cssSelector(".col-md-7 .ddm-field-text")).sendKeys("Lidia F N Melo Roque");
	Thread.sleep(1000);

//Inserção campo area
	driver.findElement(By.cssSelector(".col-md-12 > .form-group > .ddm-field-text"))
			.sendKeys("Aprendizado em desenvolvimento e qualidade de Projetos");
	Thread.sleep(1000);

//Botão submit
	driver.findElement(By.xpath("//div//button[@class='btn btn-primary lfr-ddm-form-submit pull-right']")).click();

	Thread.sleep(5000);

	String title = driver.findElement(By.xpath("//div//h1[@class='ddm-form-name']")).getText();

	Assert.assertEquals("Information sent", title);

	driver.quit();

}

@Test
public void PortugueseForm() throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://forms.liferay.com/web/forms/shared/-/form/122548");
	Assert.assertEquals("This is a Liferay Forms", driver.getTitle());
	driver.manage().window().maximize();

//Troca de linguagem
	Thread.sleep(3000);
	driver.findElement(By.xpath(
			"//div//button[@id='_com_liferay_dynamic_data_mapping_form_web_portlet_DDMFormPortlet_kldx___menu']"))
			.click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//span[@class='taglib-text-icon']")).click();
	Thread.sleep(2000);

//botao calendario
	driver.findElement(By.xpath("//div//input[@class='form-control input-group-inset input-group-inset-after']"))
			.click();
	driver.findElement(By.xpath("//div//input[@class='form-control input-group-inset input-group-inset-after']"))
			.clear();
	driver.findElement(By.xpath("//div//input[@class='form-control input-group-inset input-group-inset-after']"))
			.sendKeys("10/03/2021");
	Thread.sleep(2000);

//Inserção do nome
	driver.findElement(By.cssSelector(".col-md-7 .ddm-field-text")).sendKeys("Lidia F N Melo Roque");
	Thread.sleep(1000);

////Inserção campo area
	driver.findElement(By.cssSelector(".col-md-12 > .form-group > .ddm-field-text"))
			.sendKeys("Aprendizado em desenvolvimento e qualidade de Projetos");
	Thread.sleep(1000);

//Botão submit
	driver.findElement(By.xpath("//div//button[@class='btn btn-primary lfr-ddm-form-submit pull-right']")).click();
	Thread.sleep(5000);

	String title = driver.findElement(By.xpath("//div//h1[@class='ddm-form-name']")).getText();

	Assert.assertEquals("Informações enviadas", title);

	driver.quit();

}
}




