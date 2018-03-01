%This is illuzxions, a game by Danish Fahim. Th point of this game is to go around shooting down enemy aircraft using your controllable missile. If you get hit by their missile 3 times you die. See how far you can get


View.Set ("graphics:1000;500") %Screen size

var font1 := Font.New ("SquareFont:75") %Fonts
var font2 := Font.New ("SquareFont:25")
var font3 := Font.New ("SquareFont:50")
var font4 := Font.New ("Digital Disorder:40")

var pic1 : int := Pic.FileNew ("F22(1).bmp") %Pictures for all the images
var pic2 : int := Pic.FileNew ("GunFire.bmp")
var pic3 : int := Pic.FileNew ("Life.bmp")
var pic4 : int := Pic.FileNew ("Life.bmp")
var pic5 : int := Pic.FileNew ("Life.bmp")
var pic6 : int := Pic.FileNew ("Ocean1.bmp")
var pic7 : int := Pic.FileNew ("Explosion2.bmp")
var pic8 : int := Pic.FileNew ("F22(2).bmp")
var pic9 : int := Pic.Mirror (pic6)
var pic10 : int := Pic.FileNew ("Bar1.bmp")
var pic11 : int := Pic.FileNew ("Bar2.bmp")
var pic12 : int := Pic.FileNew ("LIVES.bmp")
var pic13 : int := Pic.Mirror (pic8)
var pic14 : int := Pic.Mirror (pic2)
var pic15 : int := Pic.FileNew ("Hills2.bmp")
var pic20 : int := Pic.Mirror (pic15)
var pic16 : int := Pic.FileNew ("F15(1).bmp")
var pic17 : int := Pic.Mirror (pic16)
var pic18 : int := Pic.FileNew ("F16(1).bmp")
var pic19 : int := Pic.Mirror (pic18)
var pic21 : int := Pic.FileNew ("City(1).bmp")
var pic22 : int := Pic.Mirror (pic21)
var pic23 : int := Pic.FileNew ("BlackTroll.bmp")
var pic24 : int := Pic.FileNew ("EasterEgg.bmp")
var pic25 : int := Pic.FileNew ("Mountains.bmp")
var pic26 : int := Pic.Mirror (pic25)
var pic27 : int := Pic.FileNew ("GUI1.bmp")
var pic28 : int := Pic.FileNew ("Title.bmp")
var pic29 : int := Pic.FileNew ("Play.bmp")
var pic30 : int := Pic.FileNew ("Play2.bmp")
var pic31 : int := Pic.FileNew ("highscore.bmp")
var pic32 : int := Pic.FileNew ("highscore2.bmp")
var pic33 : int := Pic.FileNew ("level1.bmp")
var pic34 : int := Pic.FileNew ("level1pressed.bmp")
var pic35 : int := Pic.FileNew ("level2.bmp")
var pic36 : int := Pic.FileNew ("level2pressed.bmp")
var pic37 : int := Pic.FileNew ("level3.bmp")
var pic38 : int := Pic.FileNew ("level3pressed.bmp")
var pic39 : int := Pic.FileNew ("level4.bmp")
var pic40 : int := Pic.FileNew ("level4pressed.bmp")

%Sprites for all the images
var player : int := Sprite.New (pic1)
var Life1 : int := Sprite.New (pic3)
var Life2 : int := Sprite.New (pic4)
var Life3 : int := Sprite.New (pic5)
var Fire : int := Sprite.New (pic2)
var Background := Sprite.New (pic6)
var Background2 := Sprite.New (pic9)
var Background3 := Sprite.New (pic6)
var Explosion := Sprite.New (pic7)
var enemy := Sprite.New (pic13)
var Bar1 := Sprite.New (pic10)
var Bar2 := Sprite.New (pic11)
var LIVES := Sprite.New (pic12)
var EnemyMissile := Sprite.New (pic14)
var Hit := Sprite.New (pic8)
var playbutton := Sprite.New (pic29)
var playbuttonpressed := Sprite.New (pic30)
var highscorebutton := Sprite.New (pic31)
var highscorebuttonpressed := Sprite.New (pic32)
var level1 := Sprite.New (pic33)
var level1pressed := Sprite.New (pic34)
var level2 := Sprite.New (pic35)
var level2pressed := Sprite.New (pic36)
var level3 := Sprite.New (pic37)
var level3pressed := Sprite.New (pic38)
var level4 := Sprite.New (pic39)
var level4pressed := Sprite.New (pic40)

var x1, x2, x4, x5 : int := 0 %Speed controlling variables x1 controls player missile speed, x2 enemy, x4 bacground, x5 enemy missile.
var spawn : int %Enemy spawn distance
var Mousewherex, Mousewherey, Mousebutton : int %Mouse identifiers
var centered : boolean := false %for making cnetred false
var realfire : boolean := false %detrmines whether you have fired or not
var chars : array char of boolean %USed for keyboard
var lives : int := 3 %number of lives
var appearance : int := 100 %the y coordinate for where the enemy initally appears on the screen
var Score : int := 0 %The score, set to zero in the beggining
var hitmarkery1, hitmarkerx1, hitmarkerx2, hitmarkery2, hitmarkerenemybodyx1, hitmarkerenemybodyy1, hitmarkerenemytailx1, hitmarkerenemytaily1 : int %Player hit markers, enemy hitboxes
var hitmarkerenemybodyx2, hitmarkerenemybodyy2, hitmarkerenemytailx2, hitmarkerenemytaily2 : int %enemy hitboxes
var hitmarkerenemyx1, hitmarkerenemyx2, hitmarkerenemyy1, hitmarkerenemyy2 : int %Enemy missile hitmarker
var hitmarkerbodyx1, hitmarkerbodyy1, hitmarkertailx1, hitmarkertaily1 : int %Player hitbox body
var hitmarkerbodyx2, hitmarkerbodyy2, hitmarkertailx2, hitmarkertaily2 : int %Player hitbox tail
var destroyed : boolean := false %detrmines whether the enemy aircraft is destroyed
var start : boolean := false %starts the game

Sprite.SetHeight (player, 2) %Sets their hieght
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
Sprite.SetHeight (playbutton, 1)
Sprite.SetHeight (playbuttonpressed, 2)
Sprite.SetHeight (highscorebutton, 1)
Sprite.SetHeight (highscorebuttonpressed, 2)
Sprite.SetHeight (level1, 1)
Sprite.SetHeight (level1pressed, 2)
Sprite.SetHeight (level2, 1)
Sprite.SetHeight (level2pressed, 2)
Sprite.SetHeight (level3, 1)
Sprite.SetHeight (level3pressed, 2)
Sprite.SetHeight (level4, 1)
Sprite.SetHeight (level4pressed, 2)

var button1x1, button1x2 : int %Menu buttons
var button1y1, button1y2 : int
var button2x1, button2x2 : int
var button2y1, button2y2 : int
var Border : int := 20 %Border control
%rand identifiers
var r : real
var r2 : real
var r3 : real
var r4 : real

var extralifescore : int := 1 %extra life for raching score
var timer : int := 0 %timers, which stop unnesecary commands
var timer2 : int := 0
var timer3 : int := 0
x1 := 0
x2 := 0
x4 := 0
x5 := 0
var Color : int := 0 %Border color
var Color2 : int := 16 %Score color
var troll : boolean := false %trollpoints
var trollscore : int %trollscore
var button1hovered : boolean := true %menu booleans
var level1hovered : boolean := false
var level2hovered : boolean := false
var level3hovered : boolean := false
var level4hovered : boolean := false

%Sprites Hide/Show
Sprite.Show (playbutton)
Sprite.Hide (playbuttonpressed)
Sprite.Hide (highscorebutton)
Sprite.Hide (highscorebuttonpressed)
Sprite.Hide (level1)
Sprite.Hide (level1pressed)
Sprite.Hide (level2)
Sprite.Hide (level2pressed)
Sprite.Hide (level3)
Sprite.Hide (level3pressed)
Sprite.Hide (level4)
Sprite.Hide (level4pressed)

loop

    Pic.Draw (pic28, maxx div 2 - 200, maxy - 175, picMerge)
    Pic.Draw (pic27, maxx div 4 - 250, 0, picMerge)
    Sprite.SetPosition (playbutton, maxx div 2 - 100, maxy div 2, centered)
    Sprite.SetPosition (playbuttonpressed, maxx div 2 - 100, maxy div 2, centered)
    Sprite.SetPosition (highscorebutton, maxx div 2 - 100, maxy div 3, centered)
    Sprite.SetPosition (highscorebuttonpressed, maxx div 2 - 100, maxy div 3, centered)
    Sprite.SetPosition (level1, maxx div 2 - 100, maxy div 2 + 20, centered)
    Sprite.SetPosition (level1pressed, maxx div 2 - 100, maxy div 2 + 20, centered)
    Sprite.SetPosition (level2, maxx div 2 - 100, maxy div 2 - 40, centered)
    Sprite.SetPosition (level2pressed, maxx div 2 - 100, maxy div 2 - 40, centered)
    Sprite.SetPosition (level3, maxx div 2 - 100, maxy div 2 - 100, centered)
    Sprite.SetPosition (level3pressed, maxx div 2 - 100, maxy div 2 - 100, centered)
    Sprite.SetPosition (level4, maxx div 2 - 100, maxy div 2 - 160, centered)
    Sprite.SetPosition (level4pressed, maxx div 2 - 100, maxy div 2 - 160, centered)
    timer3 := timer3 + 1

    Input.KeyDown (chars)


    %Menu
    if button1hovered = true and chars (KEY_ENTER)
	    then
	button1hovered := false
    end if
    if button1hovered = false then
	Sprite.Hide (playbutton)
	level1hovered := true
    end if

    if level1hovered = true then
	Sprite.Show (level1)
	Sprite.Show (level2)
	Sprite.Show (level3)
	Sprite.Show (level4)
    end if

    if chars ('1') and level1hovered = true then
	Sprite.ChangePic (Background, pic15)
	Sprite.ChangePic (Background2, pic20)
	Sprite.ChangePic (Background3, pic15)
	start := true
	timer3 := 0
	Sprite.Hide (level1)
	Sprite.Hide (level2)
	Sprite.Hide (level3)
	Sprite.Hide (level4)
    elsif chars ('2') and level1hovered = true then
	Sprite.ChangePic (Background, pic6)
	Sprite.ChangePic (Background2, pic9)
	Sprite.ChangePic (Background3, pic6)
	start := true
	timer3 := 0
	Sprite.Hide (level1)
	Sprite.Hide (level2)
	Sprite.Hide (level3)
	Sprite.Hide (level4)
    elsif chars ('3') and level1hovered = true then
	Sprite.ChangePic (Background, pic21)
	Sprite.ChangePic (Background2, pic22)
	Sprite.ChangePic (Background3, pic21)
	Color := 12
	Color2 := 0
	start := true
	timer3 := 0
	Sprite.Hide (level1)
	Sprite.Hide (level2)
	Sprite.Hide (level3)
	Sprite.Hide (level4)
    elsif chars ('4') and level1hovered = true then
	Sprite.ChangePic (Background, pic25)
	Sprite.ChangePic (Background2, pic26)
	Sprite.ChangePic (Background3, pic25)
	start := true
	Color := 40
	Color2 := 0
	timer3 := 0
	Sprite.Hide (level1)
	Sprite.Hide (level2)
	Sprite.Hide (level3)
	Sprite.Hide (level4)
    end if

    View.Set ("offscreenonly")

    if start = true
	    then
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
	    rand (r4)
	    randint (trollscore, -1000, 1000)

	    %background speed limiter
	    if r2 < 0.2
		    then
		x4 := x4 + 0
	    else
		x4 := x4 + 1
	    end if

	    %enemy speed limiter

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

	    Draw.FillBox (0, 0, maxx, maxy, Color)
	    Draw.Text (realstr (Score, 0), maxx div 2 - 50, maxy - 50, font2, Color2)
	    Sprite.SetPosition (LIVES, 120, maxy - 50, centered)
	    Sprite.SetPosition (Bar2, -5, maxy - 70, centered)
	    Sprite.SetPosition (Bar1, 325, maxy - 66, centered)




	    Sprite.SetPosition (enemy, spawn, appearance, centered)
	    Sprite.SetPosition (Explosion, spawn - 15, appearance - 70, centered)
	    Draw.FillBox (spawn + 30, appearance + 13, spawn + 100, appearance + 26, 0)
	    Draw.FillBox (spawn + 130, appearance + 13, spawn + 120, appearance + 46, 0)

	    %Determines whether the enemy fires or not

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

	    %Determines whether the player fires or not
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

	    %Enemy spawn and respawn and plane changer
	    if r4 < 0.1 and spawn < -1000
		    then
		Sprite.ChangePic (enemy, pic23)
		x2 := 0
		x5 := 0
		appearance := Rand.Int (100, 350)
		troll := true
	    elsif r4 >= 0.1 and r4 < 0.33 and spawn < -1000
		    then
		Sprite.ChangePic (enemy, pic17)
		x2 := 0
		x5 := 0
		appearance := Rand.Int (100, 350)

	    elsif r4 >= 0.33 and r4 < 0.66 and spawn < -1000
		    then
		Sprite.ChangePic (enemy, pic13)
		x2 := 0
		x5 := 0
		appearance := Rand.Int (100, 350)
	    elsif r4 >= 0.66 and spawn < -1000
		    then
		Sprite.ChangePic (enemy, pic19)
		x2 := 0
		x5 := 0
		appearance := Rand.Int (100, 350)
	    end if

	    if r4 < 0.1 and spawn = -500
		    then
		Sprite.ChangePic (enemy, pic23)
		x2 := 0
		x5 := 0
		appearance := Rand.Int (100, 350)
		troll := true
	    elsif r4 >= 0.1 and r4 < 0.33 and spawn = -500
		    then
		Sprite.ChangePic (enemy, pic17)
		x2 := 0
		x5 := 0
		appearance := Rand.Int (100, 350)
	    elsif r4 >= 0.33 and r4 < 0.66 and spawn = -500
		    then
		Sprite.ChangePic (enemy, pic13)
		x2 := 0
		x5 := 0
		appearance := Rand.Int (100, 350)
	    elsif r4 >= 0.66 and spawn = -500
		    then
		Sprite.ChangePic (enemy, pic19)
		x2 := 0
		x5 := 0
		appearance := Rand.Int (100, 350)
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

	    %Enemy and player hitbox and death command
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
		x1 := 0
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
	    %Troll points
	    if troll = true and destroyed = true
		    then
		x2 := 1600
		Score := Score + trollscore
		troll := true
		delay (10)
		troll := false
	    elsif destroyed = true
		    then
		x2 := 1600
	    end if
	    %Enemy spawn control
	    if x2 = 1600
		    then
		destroyed := false
	    end if
	    if x4 = 2000
		    then
		x4 := 0
	    end if
	    %Lives control
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
	    %Gameover
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
		Draw.FillBox (0, 0, maxx, maxy, 0)
		exit

	    end if
	    %Extralife giver
	    if Score >= 1000 * extralifescore and Score <= 1000 * extralifescore + 100 and lives = 2 and timer > 1000
		    then
		lives := 3
		timer := 0
		extralifescore := extralifescore + 1
	    elsif Score >= 1000 * extralifescore and Score <= 1000 * extralifescore + 100 and lives = 1 and timer > 1000
		    then
		lives := 2
		timer := 0
		extralifescore := extralifescore + 1
	    end if

	end loop

	%Gameoverscreen
	Border := Border - 1
	if Border = 0 then
	    Border := 20
	end if
	if Score < 0 then
	    Pic.Draw (pic23, maxx div 2 - 50, 30, picMerge)
	    Draw.Text ("PROBLEM?", 200, maxy - 200, font1, Rand.Int (0, 255))
	    Draw.Text (realstr (Score, 0), maxx div 2 - 80, 100, font3, Rand.Int (0, 255))
	    Draw.Text ("Your score is", maxx div 2 - 150, 200, font4, Rand.Int (0, 255))
	    Draw.Box (0 + Border, 0 + Border, maxx - Border, maxy - Border, Rand.Int (0, 255))
	else
	    Font.Draw ("GAME OVER", 200, maxy - 200, font1, Rand.Int (0, 255))
	    Draw.Text (realstr (Score, 0), maxx div 2 - 30, 100, font3, Rand.Int (0, 255))
	    Draw.Text ("Your score is", maxx div 2 - 150, 200, font4, Rand.Int (0, 255))
	    Draw.Box (0 + Border, 0 + Border, maxx - Border, maxy - Border, Rand.Int (0, 255))
	end if
	Sprite.Hide (level1)
	Sprite.Hide (level1pressed)
	Sprite.Hide (level2)
	Sprite.Hide (level2pressed)
	Sprite.Hide (level3)
	Sprite.Hide (level3pressed)
	Sprite.Hide (level4)
	Sprite.Hide (level4pressed)


	View.Update

    end if
end loop

