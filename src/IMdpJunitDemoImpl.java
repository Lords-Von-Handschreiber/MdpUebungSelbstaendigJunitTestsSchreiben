
public class IMdpJunitDemoImpl implements IMdpJunitDemo {

	@Override
	public boolean isEmpty(String s) { 
		return (s == null || s.length() == 0);
	}

	@Override
	public String capitalize(String s) {
		String lower = s.toLowerCase().substring(1);
		String first = s.substring(0, 1);
		first.toUpperCase();
		
		return first.toUpperCase()+lower;
	}

	@Override
	public String reverse(String s) throws NullPointerException {
		String strRet = "";
		for(int i = s.length()-1; i >= 0; i--){
			strRet = strRet + s.substring(i,i+1);
		}
		return strRet;
	}

	@Override
	public String join(String... strings) {
		String strRes = "";
		for(String str : strings){
			strRes += str;
		}
		return strRes;
	}

}
