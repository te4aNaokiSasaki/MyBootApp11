package jp.te4a.spring.boot.myapp12;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
public class TestValidator implements ConstraintValidator<TestValid,String>{
	String param;
	@Override
	public void initialize(TestValid nv){ param =  nv.param(); }
	@Override
	public boolean isValid(String in,ConstraintValidatorContext cxt){
		if(in == null){
			return false;
		}
		System.out.println(in.equals(param));
		return !in.equals(param);
    }
}