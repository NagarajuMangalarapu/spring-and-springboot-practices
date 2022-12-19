package springpract;

public class HelloClass extends Hello1Class
{
	public Hello1Class helloclass;

	public HelloClass(Hello1Class helloclass) {
		
		this.helloclass = helloclass;
	}
	public String getname()
	{
		return helloclass.newName();
	}

}
