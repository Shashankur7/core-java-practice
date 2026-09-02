//class Country{
//	String name;
//	double gdp;
//	String state;
//	String lang;
//	String president;
//
//	public Country(String name, double gdp, String state, String lang, String president){
//		super();
//		this.name = name;
//		this.gdp = gdp;
//		this.state = state;
//		this.lang = lang;
//		this.president = president;
//	}
//
//	public String getCountryInfo(){
//		return "Country [name = " + name + " , gdp= " + gdp +" , state= " + state + " ,  lang = " +  lang + " ,  president = " +  president + "]";
//	}
//}
//
//
//class State extends Country{
//	String sname;
//	String sdistrict;
//	String scm;
//	double sgdp;
//
//	public State(String name, double gdp, String state , String lang, String president,
//			String sname , String sdistrict, String scm , double sgdp){
//
//			super(name , gdp , state , lang , president);
//			this.sname = sname ;
//			this.sdistrict = sdistrict;
//			this.scm = scm;
//			this.sgdp = sgdp;
//
//	}
//
//	public String getStateInfo(){
//		return "State [sname = " + sname + ", sdistrict = " + sdistrict + ", scm = " + scm + ", sgdp = " + sgdp + "]";
//	}
//}
//
//class District extends State{
//	String dname;
//	String dmla;
//	double dbuget;
//	String dpopulation;
//
//    public District(String name, double gdp, String state, String lnag, String president,
//                    String sname, String sdistrict, String scm, double sgdp,
//                    String dname, String dmla, String dbuget, String dbuget, String dpupulation) {
//
//    }
//
//			super(name,gdp,state,lang,president,sname,sdistrict,scm,sgdp);
//			this.dname  = dname;
//			this.dmla = dmal;
//			this.dbuget = dbuget;
//			this.dpopulation = dpopulation;
//	}
//
//	public String getDistrictInfo(){
//		return "District [dname " + dname +" , dmal = "+ dmla +" , dbuget = " + dbuget +" , dpopulation = " + dpopulatio + "]";
//	}
//
//}
//public class DriverExampleMultiLevel{
//	public static void main(String[] args){
//
//
//	District district = new District ("india " , 40000000, "Maharashtra","Hindi","Murmr","maharashta","pune","fanadvis",45.6666666,
//"pune","tiger",5000000000, "41.4lakh" );
//
//	System.out.println(district.getCountryInfo());
//	System.out.println(district.getStateInfo());
//	System.out.println(district.getDistrictInfo());
//	}
//    }
//
//
//}