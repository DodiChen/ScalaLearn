val greetString = new Array[String](3);

greetString(0) = "Hello"
greetString(1) = ","
greetString(2) = "world!\n"

for(i <- 0 to 2)
	print(greetString(i))
	
greetString(0) = "GoodBye"
greetString(1) = ","
greetString(2) = "world!\n"

for(i <- 0 to 2)
	print(greetString(i))
	
greetString.update(0, "Hello");
greetString.update(1, ",");
greetString.update(2, "World");
for(i <- 0.to(2))
	print(greetString.apply(i))