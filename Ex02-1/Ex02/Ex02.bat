@echo off
echo ++++++++++++ Ex02�̌������J�n���܂� ++++++++++++
pause
setlocal enabledelayedexpansion
set no=1
rem for %%n in (01,02,03,04,05,06,07,08,09,10) do (
for /l %%n in (1,1,10) do (
	if !no! gtr 9 (
		set FileNo=Ex02!no!
	) else (
		set FileNo=Ex020!no!
	)
	if not exist !FileNo!.java goto TestEnd
	echo ----- !FileNo! Test Start --
	if exist !FileNo!.class (
		"C:\Program Files\Java\jdk1.8.0_321\bin\Java" !FileNo!
	) else (
		echo  xxxxxxxxxx �R���p�C�����������Ă��܂��� xxxxxxxxxx
		dir !FileNo!.*
	)
	echo         -- !FileNo! Test Finish -----
	echo:
	set /a no=no+1
	pause
)
goto :TestFinish
:TestEnd
echo !FileNo! �ȍ~�̃\�[�X�t�@�C���������̂Ō����͂ł��܂���
echo:
:TestFinish
echo ++++++++ �ȏ��Ex02�̌������I�����܂� ++++++++
echo:
pause
dir
pause
exit /b
