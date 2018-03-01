import hsa.*;
public class SearchAndSort{ 

///////////////////////////////////////////////////////////////////Sub Methods////////////////////////////////////////////////////////////////////////////////////
  
    public static void printNumbers(int[] numbers){
	for(int i = 0; i < numbers.length; i++){
	    System.out.println(numbers[i]);
	}
    }
    
    public static void swapNumbers(int[] numbers, int i, int j){
	int placeHolder = 0;
	placeHolder = numbers[i];
	numbers[i] = numbers[j];
	numbers[j] = placeHolder;  
    }
    
    public static int[] createRandomArray(int size, int lowest, int highest){
	int[] numbers = new int[size];
	for (int i = 0; i < size; i++){
	    numbers[i] = (int) (Math.random() * (highest - lowest) + lowest);
	}
	return numbers;
    }
    
    public static int indexOfLargest(int[] numbers, int end){
	int largestIndex = 0;
	int largest = 0;
	for (int i = 0; i <= end; i++){
	    if(largest < numbers[i]){
		largestIndex = i;
		largest = numbers[i];
	    }
	} 
	return largestIndex;
    }
    
    public static void shiftElements(int[] integers, int start, int end){
	for(int i = end; i > start; i--){
	    integers[i] = integers[i - 1];
	}    
    }
    
///////////////////////////////////////////////////////////////////Sort Methods//////////////////////////////////////////////////////////////////////////////////    
    
    public static void selectionSort(int[] integers){
	for (int i = integers.length - 1; i > 0; i--){
	    swapNumbers(integers, indexOfLargest(integers, i), i);
	}
    }  
    
    public static void bubbleSort(int[] integers){
	boolean swapped = true;
	for (int i = integers.length - 1; i > 0 && swapped; i--){
	    swapped = false;  
	    for (int j = 0; j <= i - 1; j++){ 
		if (integers[j] > integers[j + 1]){
		    swapNumbers(integers, j, j + 1);
		    swapped = true;
		}
	    }
	}
    }

    public static void insertionSort(int[] integers){
	for (int i = 0; i < integers.length; i++){
	    boolean largerFound = false;
	    int j = 0;
	    for(j = 0; j < i && !largerFound; j++){
		largerFound = integers[j] > integers[i];
	    }
	    if (largerFound){
		j--;
		int temp = integers[i];
		shiftElements(integers, j, i);
		integers[j] = temp;
	    }
	}
    }
    
///////////////////////////////////////////////////////////////////Merge Array Method//////////////////////////////////////////////////////////////////////////////
    
    public static String[] mergeLists(String[] list1, String[] list2){
	String[] resultList = new String[list1.length + list2.length];
	int p = 0;
	int q = 0;
	int r = 0;
	while (p < list1.length || q < list2.length){
	    if (p == list1.length) {
		resultList[r] = list2[q];
		q++;
	    }
	    else if (q == list2.length){
		resultList[r] = list1[p];
		p++;
	    }
	    else if (list1[p].compareTo(list2[q]) < 0){
		resultList[r] = list1[p];
		p++;
	    }
	    else {
		resultList[r] = list2[q];
		q++;
	    }
	    r++;
	}
	return resultList;
    }
    
///////////////////////////////////////////////////////////////////2D Arrays///////////////////////////////////////////////////////////////////////////////////
    
    public static String[][] studentsAndCourses = {
	{"710505725", "PHY150,CSC148,HIS378,ENG140,PSY100"},
	{"401274439", "ENG140,CSC148,MAT223,MUS305,PHY150,HIS378,PSY100"},
	{"401296037", "ENG140,CSC148,MAT223,MUS305,PHY150,HIS378,PSY100"},
	{"710705436", "ENG140,CSC148,MAT223,PHY150,HIS378"},
	{"568889529", "CSC148,PHY150,HIS378,PSY100,ENG140"},
	{"710498144", "ENG140,CSC148"},
	{"428824320", "ENG140,CSC148,PHY150,HIS378 MAT223,PSY100"},
	{"568351935", "ENG140,CSC148"},
	{"568977635", "ENG140,CSC148"},
	{"710982646", "ENG140,MAT223,CSC148,MUS305,HIS378,PSY100"},
	{"568470234", "ENG140,CSC148"},
	{"710290726", "ENG140,CSC148,MAT223,MUS305,PHY150,HIS378,PSY100"},
	{"710792032", "MAT223,MUS305,ENG140,CSC148,PHY150,HIS378,PSY100"},
	{"710300047", "ENG140,CSC148"},
	{"710306647", "ENG140,CSC148,MAT223,MUS305,PHY150,HIS378,PSY100"},
	{"428113528", "ENG140,CSC148,MAT223,MUS305,PHY150,HIS378,PSY100"},
	{"710261326", "ENG140,CSC148,MAT223,MUS305,PHY150,HIS378,PSY100"},
	{"210894623", "ENG140,CSC148,PHY150,HIS378,PSY100,MAT223"},
	{"710607841", "ENG140,CSC148"},
	{"428134328", "ENG140,CSC148"},
	{"210886324", "ENG140,CSC148,MAT223,HIS378"},
	{"710001324", "ENG140,CSC148,HIS378,PSY100"},
	{"710500526", "ENG140,MAT223,HIS378,PSY100"},
	{"428840142", "CSC148,ENG140"},
	{"568452438", "ENG140,CSC148"},
	{"710987228", "ENG140,CSC148,MAT223,MUS305,PHY150,HIS378,PSY100"},
	{"432350042", "PSY100,HIS378,ENG140,CSC148,MAT223,MUS305,PHY150"},
	{"568962948", "ENG140,CSC148"},
	{"401273949", "MAT223,ENG140,CSC148,MUS305,HIS378,PSY100"},
	{"428226228", "ENG140,CSC148"},
	{"710888329", "ENG140,CSC148,MAT223,MUS305,PHY150,HIS378,PSY100"},
	{"428612935", "ENG140,CSC148"},
	{"428936441", "ENG140,MAT223,HIS378"}};
     
    public static String[][] courses =  {
	{"CSC148", "Computer Science", "Sanford Fleming 4307"},
	{"MAT223", "Linear Algebra", "Sidney Smith 1306"},
	{"PHY150", "Theoretical Physics", "Lash Miller 4225"},
	{"MUS305", "Music Performance III", "Edward JB 300"},
	{"ENG140", "English Literature I", "University College 1221"},        
	{"HIS378", "19th Century History", "University College 1203"},
	{"PSY100", "Introduction to Psychology", "Convocation Hall 1"}};
	
    public static String[][] students = {
	{"710290726", "Thomas", "Naida", "Science"},
	{"568351935", "Wilson", "Tierra", "Life Sciences"},
	{"710300047", "Moore", "Yolanda", "Humanities"},
	{"568097526", "White", "Alexander", "Life Sciences"},
	{"710982646", "Anderson", "Andrew", "Science"},
	{"710290327", "Garcia", "Deena", "Humanities"},
	{"568623035", "Rodriguez", "Jenni", "Science"},
	{"568977635", "Martinez", "Blaine", "Humanities"},
	{"710792032", "Hernandez", "Tina", "Life Sciences"},
	{"568889529", "Jones", "Lashaun", "Life Sciences"},
	{"428612935", "Adams", "Leatha", "Life Sciences"},
	{"710498144", "Miller", "Shakira", "Humanities"},
	{"432510848", "Lopez", "Sharie", "Humanities"},
	{"710463029", "Lee", "Rosetta", "Science"},
	{"401274439", "Johnson", "Rolf", "Life Sciences"},
	{"710306647", "Martin", "Caron", "Life Sciences"},
	{"428113528", "Jackson", "Collene", "Humanities"},
	{"428824320", "Davis", "Arron", "Life Sciences"},
	{"710261326", "Thompson", "Rina", "Humanities"},
	{"210894623", "Gonzalez", "Barney", "Life Sciences"},
	{"710607841", "Harris", "Rodrigo", "Humanities"},
	{"428134328", "Clark", "Candyce", "Life Sciences"},
	{"210864923", "Lewis", "Setsuko", "Humanities"},
	{"568470234", "Taylor", "Jannette", "Life Sciences"},
	{"401296037", "Williams", "Lynne", "Humanities"},
	{"710705436", "Brown", "Marcus", "Science"},
	{"710365423", "Robinson", "Valeria", "Science"},
	{"210886324", "Walker", "Asuncion", "Science"},
	{"710001324", "Perez", "Page", "Life Sciences"},
	{"710500526", "Hall", "Lisha", "Humanities"},
	{"428840142", "Young", "Sam", "Life Sciences"},
	{"710505725", "Smith", "Flora", "Science"},
	{"710987228", "Sanchez", "Janay", "Life Sciences"},
	{"432350042", "Wright", "Johnsie", "Humanities"},
	{"568962948", "King", "Marianela", "Life Sciences"},
	{"401273949", "Scott", "Pattie", "Humanities"},
	{"428226228", "Green", "Susannah", "Science"},
	{"568452438", "Allen", "Alix", "Science"},
	{"710888329", "Baker", "Seema", "Science"},
	{"428936441", "Nelson", "Monique", "Humanities"}}; 
	
///////////////////////////////////////////////////////////////////2D Search Methods//////////////////////////////////////////////////////////////////////////////        
 
    public static void courseDescription(String studentNumber, int row){
	String courseKey = "";
	int count = 0;
	boolean validCourse = false;
	String studentInfo = "";
	for (int i = 0; i < students.length; i++){
	    if (studentsAndCourses[row][0].equals(students[i][0])){
		studentInfo = students[i][0] + " " + students[i][1] + ", " + students[i][2] + ". Program: " + students[i][3];
	    }
	}
	System.out.println(studentInfo);
	String courseName = studentsAndCourses[row][1];
	    for (int j = 0; j < courseName.length(); j++){
		if (courseName.charAt(j) == ',' || j == courseName.length() - 1){
		    if (count == 0){
			courseKey = courseName.substring(0, courseName.indexOf(','));
		    }
		    else if (j == courseName.length() - 1){
			courseKey = courseName.substring(courseName.length() - 6);
		    }
		    else{
			courseKey = courseName.substring(count, count + 6);
		    }
		    for(int k = 0; k < courses.length; k++){
			if (courseKey.equals(courses[k][0])){
			Stdout.print("", 8);
			Stdout.println(courseKey + " " + courses[k][1] + ", " + courses[k][2]);
			validCourse = true;
		    }
		}
		if (validCourse == false){
		    Stdout.print("", 8);
		    Stdout.println(courseKey + " N/A");
		}
		count = count + 7;
		validCourse = false;
	    }
	}
	Stdout.print("\n");
    }
    
    public static void printCourseInfo(String studentNumber){
	boolean validStudentID = false;
	for (int i = 0; i < studentsAndCourses.length; i++){
	    if (studentNumber.equals(studentsAndCourses[i][0])){
		courseDescription(studentNumber, i);
		validStudentID = true;
	    }
	    else if (studentNumber.equals(studentsAndCourses[i][0].substring(0, 2))){
		courseDescription(studentNumber, i);
		validStudentID = true;
	    }
	    else if (studentNumber.equals("*")){
		courseDescription(studentNumber, i);
		validStudentID = true;
	    }
	}
	if (!validStudentID){
	    Stdout.println("No Student ID's found.");
	}
    }

///////////////////////////////////////////////////////////////////Search Methods//////////////////////////////////////////////////////////////////////////////
    
    public static int binarySearch(int[] integers, int key){
	int start = 0;
	int end = integers.length - 1;
	int index = (start + end) / 2; 
	while (integers[index] != key && start <=  end){
	    if (key > integers[index]){start = index + 1;}
	    else{end = index - 1;}
	    index = (start + end) / 2;
	}
	return (start > end) ? -1 : index;
    }
    
    public static int linearSearch(int[] list, int key){
	int i = 0;
	while (i < list.length && list[i] != key){
	    i++;
	}
	return i == list.length ? -1 : i;
    }
    
    public static int linearSearchString(String[] list, String key){
	int i = 0;
	while (i < list.length && !list[i].equals(key)){
	    i++;
	}
	return i == list.length ? -1 : i;
    }
    
    public static int binarySearchString(String[] list, String key){
	int start = 0;
	int end = list.length - 1;
	int index = (start + end) / 2;
	while (!list[index].startsWith(key) && start <=  end){
	    if (key.compareTo(list[index]) > 0){start = index + 1;}
	    else{end = index - 1;}
	    index = (start + end) / 2;
	}
	return (start > end) ? -1 : index;
    }
    
    public static int findFirst(int[] integers, int key){ 
	int result = binarySearch(integers, key);
	if (result !=  -1){
	    while(result >= 0 && integers[result] == key){
		result--;
	    }
	    result++;
	}
	return result;
    }
    
    public static int findFirstString(String[] list, String key){ 
	int result = binarySearchString(list, key);
	if (result !=  -1){
	    while(result >= 0 && list[result].startsWith(key)){
		result--;
	    }
	    result++;
	}
	return result;
    }
    
    public static String[] findAll(String[] list, String key){
	String[] resultList = null;
	int index = findFirstString(list, key);
	if (index != -1){
	    resultList = new String[50];
	    for (int i = 0; i < resultList.length; i++){
		resultList[i] = null;
	    }
	    for(int i = 0; i < resultList.length && list[index].startsWith(key); i++, index++){
		resultList[i] = list[index];
	    }
	}
	return resultList;
    }

///////////////////////////////////////////////////////////////////Main Method//////////////////////////////////////////////////////////////////////////////   
    
    public static void main(String args[]){
	String[] list1 = {"Anna", "Ann", "Anto", "Peter", "Todd", "Veronica", "Yolanda"};
	/*String[] list2 = {"Martin", "Naomi", "Susan"};
	String[] mergedList = mergeLists(list1, list2);
	for (int i = 0; i < mergedList.length; i++){
	    System.out.println(mergedList[i]);
	}*/
	
	/*Stdout.print("Enter student number: ");
	String studentNumber = Stdin.readString();
	Stdout.print("\n");
	printCourseInfo(studentNumber);*/
	
	//int[] numbers = {0,1,2,3,5,5,8,9,9,9,9,9,10,14,16};
	int[] numbers = createRandomArray(500, 0, 500);
	bubbleSort(numbers);
	/*for (int i = 0; i < list1.length; i++){
	    System.out.println(list1[i]);
	}
	System.out.println("");
	String list2[] = findAll(list1, "A");
	for (int i = 0; i < list2.length; i++){
	    System.out.println(list2[i]);
	}*/
	int count = 0;
	int i = 0;
	for(i = 0; i < 50; i++){
	    int key = (int)(Math.random() * 500);
	    System.out.println(key);
	}
	
    }
}
