View.Set ("graphics:1000;500")
var font1 := Font.New ("SquareFont:100")
var font2 := Font.New ("SquareFont:25")
var font3 := Font.New ("SquareFont:50")
var font4 := Font.New ("Digital Disorder:40")
var pic1 : int := Pic.FileNew ("F22(1).bmp")
var pic2 : int := Pic.FileNew ("GunFire.bmp")
var pic3 : int := Pic.FileNew ("Life.bmp")
var pic4 : int := Pic.FileNew ("Life.bmp")
var pic5 : int := Pic.FileNew ("Life.bmp")
var pic6 : int := Pic.FileNew ("Hills2.bmp")
var pic7 : int := Pic.FileNew ("Explosion2.bmp")
var pic8 : int := Pic.FileNew ("F22(2).bmp")
var pic9 : int := Pic.Mirror (pic6)
var pic10 : int := Pic.FileNew ("Bar1.bmp")
var pic11 : int := Pic.FileNew ("Bar2.bmp")
var pic12 : int := Pic.FileNew ("LIVES.bmp")
var pic13 : int := Pic.Mirror (pic8)
var pic14 : int := Pic.Mirror (pic2)
var player : int := Sprite.New (pic1)
var Life1 : int := Sprite.New (pic3)
var Life2 : int := Sprite.New (pic4)
var Life3 : int := Sprite.New (pic5)
var Fire : int := Sprite.New (pic2)
var Background : int := Sprite.New (pic6)
var Background2 : int := Sprite.New (pic9)
var Background3 : int := Sprite.New (pic6)
var Explosion : int := Sprite.New (pic7)
var enemy : int := Sprite.New (pic13)
var Bar1 := Sprite.New (pic10)
var Bar2 := Sprite.New (pic11)
var LIVES := Sprite.New (pic12)
var EnemyMissile := Sprite.New (pic14)
var Hit := Sprite.New (pic8)
var x1, x2, x3, x4, x5 : int := 0
var spawn : int
var Mousewherex, Mousewherey, Mousebutton : int
var centered : boolean := false
var realfire : boolean := false
var chars : array char of boolean
var lives : int := 3
var appearance : int := 100
var Score : int := 0
var hitmarkery1, hitmarkerx1, hitmarkerx2, hitmarkery2, hitmarkerenemybodyx1, hitmarkerenemybodyy1, hitmarkerenemytailx1, hitmarkerenemytaily1 : int
var hitmarkerenemybodyx2, hitmarkerenemybodyy2, hitmarkerenemytailx2, hitmarkerenemytaily2 : int
var hitmarkerenemyx1, hitmarkerenemyx2, hitmarkerenemyy1, hitmarkerenemyy2 : int
var hitmarkerbodyx1, hitmarkerbodyy1, hitmarkertailx1, hitmarkertaily1 : int
var hitmarkerbodyx2, hitmarkerbodyy2, hitmarkertailx2, hitmarkertaily2 : int
var redo : int
var destroyed : boolean := false
Sprite.SetHeight (player, 2)
Sprite.SetHeight (Life1, 3)
Sprite.SetHeight (Life1, 4)
Sprite.SetHeight (Life1, 5)
Sprite.SetHeight (Background, 0)
Sprite.SetHeight (Background2, 0)
Sprite.SetHeight (Background3, 0)
Sprite.SetHeight (Explosion, 3)
Sprite.SetHeight (enemy, 2)
Sprite.SetHeight (Fire, 3)
Sprite.SetHeight (LIVES, 5)
Sprite.SetHeight (Bar1, 5)
Sprite.SetHeight (Bar2, 5)
Sprite.SetHeight (EnemyMissile, 3)
Sprite.SetHeight (Hit, 2)
var Border : int := 20
var r : real
var r2 : real
var r3 : real
var extralifescore : int := 1
var timer : int := 0
var timer2 : int := 0
x1 := 0
x2 := 0
x3 := 0
x4 := 0
x5 := 0
loop
    View.Set ("offscreenonly")
    loop
	loop
	    cls
	    Sprite.Show (enemy)
	    Sprite.Show (Background)
	    Sprite.Show (Background2)
	    Sprite.Show (Background3)
	    Sprite.Show (player)
	    Sprite.Show (LIVES)
	    Sprite.Show (Bar1)
	    Sprite.Show (Bar2)
	    Sprite.Show (EnemyMissile)
	    Sprite.Hide (Hit)
	    x5 := x5 + 1
	    timer := timer + 1
	    timer2 := timer2 + 2
	    rand (r)
	    rand (r2)
	    rand (r3)
	    if r2 < 0.2
		    then
		x4 := x4 + 0
	    else
		x4 := x4 + 1
	    end if

	    if r3 < 0.000001
		    then
		x2 := x2 + 2
	    elsif r3 > 0.5 then
		x2 := x2 + 0
	    else
		x2 := x2 + 1
	    end if



	    Mouse.Where (Mousewherex, Mousewherey, Mousebutton)


	    spawn := maxx - x2
	    Sprite.SetPosition (player, Mousewherex - 78, Mousewherey - 23, centered)
	    Sprite.SetPosition (Hit, Mousewherex - 78, Mousewherey - 23, centered)
	    Draw.FillBox (Mousewherex - 50, Mousewherey - 8, Mousewherex + 50, Mousewherey + 3, 0)
	    Draw.FillBox (Mousewherex - 50, Mousewherey - 8, Mousewherex - 40, Mousewherey + 23, 0)


	    Draw.Text (realstr (Score, 0), maxx div 2 - 50, maxy - 50, font2, 16)
	    Sprite.SetPosition (LIVES, 120, maxy - 50, centered)
	    Sprite.SetPosition (Bar2, -5, maxy - 70, centered)
	    Sprite.SetPosition (Bar1, 325, maxy - 66, centered)




	    Sprite.SetPosition (enemy, spawn, appearance, centered)
	    Sprite.SetPosition (Explosion, spawn - 15, appearance - 70, centered)
	    Draw.FillBox (spawn + 30, appearance + 13, spawn + 100, appearance + 26, 0)
	    Draw.FillBox (spawn + 130, appearance + 13, spawn + 120, appearance + 46, 0)

	    if r <= 0.5
		    then
		Sprite.SetPosition (EnemyMissile, (spawn + 50) - x5, appearance + 10, centered)
		Draw.FillBox ((spawn + 50) - x5, appearance + 14, (spawn + 88) - x5, appearance + 16, 0)
	    else
		Sprite.SetPosition (EnemyMissile, (spawn + 50), appearance + 10, centered)
		Draw.FillBox ((spawn + 50), appearance + 14, (spawn + 88), appearance + 16, 0)
	    end if


	    Sprite.SetPosition (Life1, 20, maxy - 50, centered)
	    Sprite.SetPosition (Life2, 40, maxy - 50, centered)
	    Sprite.SetPosition (Life3, 60, maxy - 50, centered)
	    Sprite.SetPosition (Background, 0 - x4, 0, centered)
	    Sprite.SetPosition (Background2, 1000 - x4, 0, centered)
	    Sprite.SetPosition (Background3, 2000 - x4, 0, centered)
	    Sprite.SetPosition (Fire, (Mousewherex - 10) + x1, (Mousewherey - 17), centered)
	    if Mousebutton = 1 then
		Draw.FillBox ((Mousewherex - 10) + x1, (Mousewherey - 14), (Mousewherex + 28) + x1, (Mousewherey - 11), 0)
		Sprite.Show (Fire)
		realfire := true
	    end if
	    if realfire = true
		    then
		x1 := x1 + 1
		delay (Rand.Int (0, 1))
	    end if
	    if Mousebutton = 0 then
		x1 := 0
	    end if
	    if x1 = maxx then
		x1 := 0
	    end if
	    delay (Rand.Int (0, 1))
	    if spawn = -500
		    then
		x2 := 0
		x5 := 0
		appearance := Rand.Int (100, 400)
	    end if
	    if spawn <= -1000
		    then
		x2 := 0
		x5 := 0
		appearance := Rand.Int (100, 450)
	    end if


	    if x5 >= 1000 and x5 <= 1001
		    then
		x5 := 0
	    end if

	    hitmarkerx1 := (Mousewherex - 10) + x1
	    hitmarkery1 := Mousewherey - 14
	    hitmarkerx2 := (Mousewherex + 28) + x1
	    hitmarkery2 := Mousewherey - 11
	    hitmarkerenemyx1 := (spawn + 50) - x5
	    hitmarkerenemyy1 := appearance + 14
	    hitmarkerenemyx2 := (spawn + 88) - x5
	    hitmarkerenemyy2 := appearance + 16
	    hitmarkerenemybodyx1 := spawn + 30
	    hitmarkerenemybodyx2 := spawn + 100
	    hitmarkerenemybodyy1 := appearance + 13
	    hitmarkerenemybodyy2 := appearance + 26
	    hitmarkerenemytailx1 := spawn + 130
	    hitmarkerenemytailx2 := spawn + 120
	    hitmarkerenemytaily1 := appearance + 13
	    hitmarkerenemytaily2 := appearance + 46
	    hitmarkerbodyx1 := Mousewherex - 50
	    hitmarkerbodyx2 := Mousewherex + 50
	    hitmarkerbodyy1 := Mousewherey - 8
	    hitmarkerbodyy2 := Mousewherey + 3
	    hitmarkertailx1 := Mousewherex - 50
	    hitmarkertailx2 := Mousewherey - 40
	    hitmarkertaily1 := Mousewherey - 8
	    hitmarkertaily2 := Mousewherey + 23
	    if hitmarkerx1 >= hitmarkerenemybodyx1 and hitmarkerx1 <= hitmarkerenemybodyx2
		    and hitmarkery1 >= hitmarkerenemybodyy1
		    and hitmarkery1 <= hitmarkerenemybodyy2
		    then
		Score := Score + 100
		x1 := 0
		destroyed := true
		Sprite.Show (Explosion)
		delay (100)
		Sprite.Hide (Explosion)
	    elsif hitmarkerx2 >= hitmarkerenemybodyx1 and hitmarkerx2 <= hitmarkerenemybodyx2
		    and hitmarkery2 >= hitmarkerenemybodyy1
		    and hitmarkery2 <= hitmarkerenemybodyy2
		    then
		Score := Score + 100
		x1 := 0
		destroyed := true
		Sprite.Show (Explosion)
		delay (100)
		Sprite.Hide (Explosion)
	    elsif hitmarkerx1 <= hitmarkerenemytailx1 and hitmarkerx1 >= hitmarkerenemytailx2
		    and hitmarkery1 >= hitmarkerenemytaily1
		    and hitmarkery1 <= hitmarkerenemytaily2
		    then
		Score := Score + 100
		x1 := 0
		destroyed := true
		Sprite.Show (Explosion)
		delay (100)
		Sprite.Hide (Explosion)
	    elsif hitmarkerx2 <= hitmarkerenemytailx1 and hitmarkerx2 >= hitmarkerenemytailx2
		    and hitmarkery2 >= hitmarkerenemytaily1
		    and hitmarkery2 <= hitmarkerenemytaily2
		    then
		Score := Score + 100
		x1 := 999
		destroyed := true
		Sprite.Show (Explosion)
		delay (100)
		Sprite.Hide (Explosion)
	    end if
	    if hitmarkerenemyx1 >= hitmarkerbodyx1 and hitmarkerenemyx1 <= hitmarkerbodyx2
		    and hitmarkerenemyy1 >= hitmarkerbodyy1
		    and hitmarkerenemyy1 <= hitmarkerbodyy1
		    then
		Sprite.Show (Hit)
		delay (100)
		Sprite.Hide (Hit)
		lives := lives - 1
		x5 := -5000
	    elsif
		    hitmarkerenemyx2 >= hitmarkerbodyx1 and hitmarkerenemyx2 <= hitmarkerbodyx2
		    and hitmarkerenemyy2 >= hitmarkerbodyy1
		    and hitmarkerenemyy2 <= hitmarkerbodyy1
		    then
		Sprite.Show (Hit)
		delay (100)
		Sprite.Hide (Hit)
		lives := lives - 1
		x5 := -5000
	    elsif
		    hitmarkerenemyx1 >= hitmarkertailx1 and hitmarkerenemyx1 <= hitmarkertailx2
		    and hitmarkerenemyy1 >= hitmarkertaily1
		    and hitmarkerenemyy1 <= hitmarkertaily2
		    then
		Sprite.Show (Hit)
		delay (100)
		Sprite.Hide (Hit)
		lives := lives - 1
		x5 := -5000
	    elsif
		    hitmarkerenemyx2 >= hitmarkertailx1 and hitmarkerenemyx2 <= hitmarkertailx2
		    and hitmarkerenemyy2 >= hitmarkertaily1
		    and hitmarkerenemyy2 <= hitmarkertaily2
		    then
		Sprite.Show (Hit)
		delay (100)
		Sprite.Hide (Hit)
		lives := lives - 1
		x5 := -5000
	    end if
	    if destroyed = false
		    then
		x2 := x2 + 1
	    end if

	    if destroyed = true
		    then
		x2 := 1600
	    end if
	    if x2 = 1600
		    then
		destroyed := false
	    end if
	    if x4 = 2000
		    then
		x4 := 0
	    end if
	    if lives = 3 then

		Sprite.Show (Life3)
		Sprite.Show (Life2)
		Sprite.Show (Life1)
	    end if

	    if lives = 2 then

		Sprite.Hide (Life3)
		Sprite.Show (Life2)
		Sprite.Show (Life1)
	    end if
	    if lives = 1 then
		Sprite.Hide (Life3)
		Sprite.Hide (Life2)
		Sprite.Show (Life1)
	    end if
	    if lives <= 0
		    then
		Sprite.Hide (enemy)
		Sprite.Hide (Life1)
		Sprite.Hide (Life2)
		Sprite.Hide (Life3)
		Sprite.Hide (Background)
		Sprite.Hide (Background2)
		Sprite.Hide (Background3)
		Sprite.Hide (EnemyMissile)
		Sprite.Hide (Fire)
		Sprite.Hide (player)
		Sprite.Hide (LIVES)
		Sprite.Hide (Bar1)
		Sprite.Hide (Bar2)
		Sprite.Hide (EnemyMissile)
		Draw.FillBox (0, 400, maxx, maxy, 0)
		exit

	    end if
	    if Score = 1000 * extralifescore and lives = 2 and timer >= 10000
		    then
		lives := 3
		timer := 0
		extralifescore := extralifescore + 1
	    elsif Score = 1000 * extralifescore and lives = 1 and timer >= 10000
		    then
		lives := 2
		timer := 0
		extralifescore := extralifescore + 1
	    end if



	end loop
	Font.Draw ("GAME OVER", 200, maxy - 200, font1, Rand.Int (0, 255))
	Draw.Text (realstr (Score, 0), maxx div 2 - 30, 100, font3, Rand.Int (0, 255))
	Draw.Text ("Your score is", maxx div 2 - 200, 200, font4, Rand.Int (0, 255))
	Draw.Box (0 + Border, 0 + Border, maxx - Border, maxy - Border, Rand.Int (0, 255))

	Border := Border - 1
	if Border = 0 then
	    Border := 20
	end if


	View.Update
	delay (100)

    end loop
end loop

