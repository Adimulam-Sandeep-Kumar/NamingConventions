package ai.jobiak.rules;

public class Rules {

	public static void main(String[] args) {
		
		int _Len=100;       					//can  start  with '_'
		int $breadth=20;					    //can start with '$'
		int PerimeterOfRec=2*(_Len+$breadth);   //can start with UpperCase
		System.out.println(PerimeterOfRec);
 
		double  _1_height=34.98;      					   //can contain numbers
		double bre3th_ =67.8;             				   //can end with underscore
		double Area_Of_Triangle=(bre3th_*_1_height)/2;    //mixed with upper and lower 
		System.out.println(Area_Of_Triangle);

		double RADIUS=34.543;    						    //all charcaters can be in Uppercase
		double AREA_OF_CIRCLE$=(Math.PI)*(RADIUS*RADIUS);  //can end with '$' 
		System.out.println(AREA_OF_CIRCLE$); 

		//int catch=20;         //cannot use keywords
		//int 2num=30;         //cannot start with number
		//int #you=67;         //cannot start with special chars other than '_' , '$'
		//int area of=87;     // cannot contain blank spaces
		//int area#of=78;     //cannot contain special characters other than '_' ,'$'
		//int 20=10          //not allowed

	}

}
