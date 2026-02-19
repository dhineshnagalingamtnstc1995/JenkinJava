package COM.JenkinnJava.MyController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Conntroller {
	@GetMapping(value = "/getMax/{a}/{b}")
	public int getMaximum(@PathVariable int a, @PathVariable int b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}
	@GetMapping("/getNameAndLength")
	public String getNAL(@RequestParam String name) {
		return name+"   ->   LENGTH is= "+name.length();
	}
	
	@GetMapping("/getMaxNameLength")
	public String getMNL(@RequestParam String name1,String name2) {
		if(name1.length()>name2.length()) {
		return "MAXIMUM LENGTH NAME IS = "+name1;
		}
		else {
			return "MAXIMUM LENGTH NAME IS = "+name2;	
		}
	}
	@GetMapping("/getPalindrome")
	public String getpalindrome(@RequestParam String a) {
		String rev="";
		for(int i=a.length()-1;i>=0;i--) {
			rev=rev+a.charAt(i);
		}
		if(a.equals(rev)) {
			return a+" is Palindrome";
		}
		else {
			return a+" is not Palindrome";
		}
	}
}
