object ListTest{
	
	def main(args: Array[String]){
		val nullList = List();  // null list
		println(nullList);

		val nullList2 = Nil; // null list
		println(nullList2);

		val thrill = "Will" :: "fill" :: "until" :: Nil; // create a List contains three value
		println(thrill)

		val temp = List("a", "b") ::: List("c", "d"); // cont two list
		println(temp)

		println(thrill(2));  // get the value index = 2

		val countNumber = thrill.count(s => s.length == 4) // get the count number which length equal 4
		println(countNumber)
		
		println(thrill.drop(2)) // shanchu  qian liangge   yuansu, return new List
		println(thrill.dropRight(2)) // shanchu  hou liangge   yuansu, return new List
		
		println(thrill.exists(s => s == "until")) // if exists until
		
		println(thrill.filter(s => s.length == 4)) // return a new List which the value's length equal 4
		
		println(thrill.forall(s => s.endsWith("l"))) // return a new List whether all the value endsWith l
		
		thrill.foreach(x => println(x)) // println all the value
		
		println(thrill.head) // return the first value in List
		
		println(thrill.init) // return a list which doesn't contain the latest value in thrill
		
		println(thrill.isEmpty) // return whether this list is empty
		
		println(thrill.last) // return the last value in the list
		
		println(thrill.length) // return the length of the list
		
		println(thrill.map(s => s + "y")) // return a list which all the value add a String "y"
		
		println(thrill.mkString(",")) // return a String which generate by List value
		
		println(thrill.reverse) // return a new List daoxu
		
		println(thrill.tail)// return a new List which doesn't contain first value
	}
		
}


