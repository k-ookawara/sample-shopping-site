# アプリの動作確認

1. `Project Explorer`から`application.properties`を開きます。（もしエラーで開けなかった場合[Appendix](./appendix.md)を参照）
![picture 81](images2/1ebf2ee418a3ea3ed61ad7ebf915fd49430fe5e56ea756752a5b51efb304dd15.png)  

1. `spring.datasource.password`にMySQL環境構築時に設定したパスワードを入力し保存。
![picture 82](images2/3c54fd424ba0ae862802e37f8c6f709f532c5f904c8efa64f7f2643d8654068a.png)  

1. 画面上部のBoot Dashboardのアイコンをクリック。
![picture 53](images2/de4086d4e8770c5ed20719b7811b8c912800045b0fcfd1c777eb410ed8fd26be.png)  

1. sample-shopping-siteを選択して起動アイコンをクリック。
![picture 54](images2/604996359352bbc80c0a5f749da3893b1335c3ec28bbc59d4399caa9b22fdc16.png)  

1. Consoleに`Started SampleShoppingSiteApplication`が出ていたらアプリ起動成功。

1. [http://localhost:8080/seller/register](http://localhost:8080/seller/register)にアクセスして画面表示を確認。
![picture 55](images2/5f3d8da9309a4037b00745bed80680d61689940b69ee424ace7f25e7af656ea4.png)  

1. 試しに登録してみます。
![picture 66](images2/a38aece950d11be197c68deb33734ae94b8f700f3b1d5d68da509701a952ec42.png)  

1. 登録ができました。
![picture 67](images2/4647f81095be89e6ac6a8836054f8ead5c39945a46e6ef22edf3da13028b1769.png)  

動作確認は以上です。