View.Set ("graphics:720;557")
var x, x2, x3, Color, speed : int
var backpic1 := Pic.FileNew ("a.jpg")
var backpic2 := Pic.Mirror (backpic1)
randint (Color, 0, 255)
randint (speed, 1, 20)
for background1 : 1 .. 4
    x := 0
    x2 := x + 1433
    x3 := x2 + 1433
    loop
	delay (5)
	Pic.Draw (backpic1, x, 0, picMerge)
	Pic.Draw (backpic2, x2, 0, picMerge)
	Pic.Draw (backpic1, x3, 0, picMerge)
	x := x - 1
	x2 := x2 - 1
	x3 := x3 - 1
	if x3 = 0 then
	    exit
	end if
    end loop
end for


