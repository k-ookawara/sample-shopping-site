# Eclipseの環境構築

### 目次
+ [Eclipse IDEのインストール](#eclipse-ideのインストール)
+ [Java環境変数の設定](#java環境変数の設定)
+ [プラグインのインストール](#プラグインのインストール)
+ [各種設定](#各種設定)
+ [サンプルコードの準備](#サンプルコードの準備)
+ [Eclipseにインポート](Eclipseにインポート)

---

### Eclipse IDEのインストール

1. [ダウンロードサイト(https://www.eclipse.org/downloads/)](https://www.eclipse.org/downloads/)へアクセス。
 
1. Download x86_64をクリック。
![picture 4](images/c3a14eaab70e6f5bbcfcf47e1f0fe274208f9d4b1e37d751399d9a40ad572c02.png)  

1. Downloadをクリックしてインストーラをダウンロード。
![picture 5](images/04c96ea27285bcb5f01732b8d4d57bb281248c6e896e14662a4fa92e017e1a8a.png)  

1. ダウンロードが完了したら`eclipse-inst-jre-win64.exe`ファイルを実行。
![picture 6](images/cd5c58a2f231ec70acb6ba47c4ec60ca98d66f9704d6bb8537e7fedf8f184e48.png)  

1. `Eclipse IDE for Enterprise Java and Web Developer`を選択。 
![picture 7](images/6c0924017f20270ea2cf600699ea9bf04f8ed52bea6fb8c97743529ee5e2e094.png)  

1. `java 11+VM`の右側にあるフォルダアイコンをクリック。
![picture 14](images/f444186731d44da1daee0b3d656cbd4010881e381811450f2c339ef22657986b.png)

1. JRE 17.0.1を選択してOKをクリック。
![picture 4](images/e8e426fa859759277f4fd89396d29918fe9374203d032e4128755665e4c2f9ea.png)  

1. `INSTALL`をクリック。
![picture 5](images/13f7e87f1997702515c0d6cfe528240acc8e8cd4c7e95233107160862ac1cb50.png)  

1. インストール完了したら`LAUNCH`をクリックして起動。
![picture 15](images/3927c0c103408c766864bcb8780621a4baf65d9a53d20fbffd6e40491f01eb73.png)  

1. これも`LAUNCH`をクリックして起動。
![picture 16](images/9e67cd1e75aa96d571c4a1a9bba099bef535e13f591a28d72ffdd2d97e92e580.png)  

### Java環境変数の設定

1. `Windowsキー + R`で`ファイル名を指定して実行`を表示。`SystemPropertiesAdvanced.exe`を入力してOKをクリック。
![picture 71](images2/42a9525093c4ce0b0c9e83544c6ae2c52fab78360ca43d3d4e154db2697befbf.png)  

1. 下部の環境変数をクリック。
![picture 72](images2/1d1b2ac2482bc811057275ea1f14f540e2ecf273fd9272b907dee195f844bbd6.png)  

1. ユーザ環境変数の新規をクリック。 
![picture 75](images2/7f467ac82d8ee8aa4201ad50ef4f79d2fcbbeda076832767ad3bd6dd238628ac.png)  

1. 変数名に`JAVA_HOME`、変数値にはJavaのホームフォルダパスを入力。
参考パス：  
`C:\Users\{自分のユーザ名}\.p2\pool\plugins\org.eclipse.justj.openjdk.hotspot.jre.full.win32.x86_64_17.0.3.v20220515-1416\jre`
(x86_64_17.0.3.v20220515-1416)の部分は適宜変更される可能性あり。エクスプローラーから実フォルダがあるか確認が必要)
![picture 76](images2/e6b1a6fc476984b476b02cc9a6ea20157b95778da5d8d5c3b6ab9a3cadc7b0d2.png)  
実フォルダを確認。
![picture 77](images2/3a6a99be855638f5839310b97b572abd714ffa4c57ce70f14b2571259bc7bb94.png)  

1. OKボタンをクリック。
![picture 78](images2/85beb300a5ccb37c71c5732ae04aa4df285e83d1c2959a8e7516a3b299a132a8.png)  

1. ユーザ環境変数にPathがなければ`新規`、あればPATHを選択した状態で`編集`をクリック。
![picture 73](images2/b116465b8e2f42e2b8fd3a9480358d7addad69feed51ed3387c20df0470d5de3.png)  

1. 新規ボタンをクリックして`%JAVA_HOME\bin%`を入力。OKボタンをクリック。
![picture 74](images2/262b475c4659abdce47d2ded16eafd12c4726bfaeeba3277f58a3beca5a137f4.png)  

1. OKボタンをクリック。
![picture 79](images2/50c2a0f6284fdc2a58ed224bb95a814ea4882a737356a7c372c4a622cbe21ad9.png)  

1. OKボタンをクリック。
![picture 80](images2/e315d419e21956e5716789e8452d154a4c0b13bc7378a4c8a67034d4b3c5ed76.png)  

### プラグインのインストール

1. メニューバーの`Help`-> `Eclipse Marketplace`をクリック 
![picture 10](images/5e8b8f55b57e6368a5830c47b157adcc46e64faf2e1975d9cfd7296e4bca12f6.png)  

1. 検索フォームに`spring`を入れて検索。
![picture 11](images/ff8dcb8b89de9750edf955bd255f05abc81b53bfc9210fdfc7267fbba93fbbee.png)  

1. `Spring Tools4(aka Spring Tool Suite 4) 4.14.1.RELEASE`のinstallをクリック。※`4.14.1.RELEASE`のバージョンは変更される可能性あり。
![picture 12](images/f8879a289c9577dd305b9ededbea3d369b2152c7c4f61de597e12da19cfcba8a.png)  

1. Confirmをクリック。
![picture 13](images/de9bbeb47b0726a3dc98324829e35a68773563f865e648d94426d8b2a2c4be23.png)  

1. `I accept the terms of the license agreements`をチェックしてFinishをクリック。
![picture 17](images/ffe38185fcbd01b76d4ca3bc2e30e6323a3bb7bced7cb14321f287d9b3dd017c.png)  

1. この画面が表示された場合は`Unsigned`をクリックして、`Trust Selected`をクリック。
![picture 18](images/926d6309aca44888743428bfea785191681fcbf2b92f78189ec4dd0cd48d1bc1.png)  

1. 再起動を求められるので、再起動したらインストール完了。
![picture 19](images/e8336aa9d9b06a2499e32ca79efcdde40a588ee7eaa5518ce20f2ca123515879.png)  

1. [https://projectlombok.org/download]にアクセスして画面中央のDownloadをクリック。  
![picture 12](images/ac71a82392d25e97340053e38f7f00ea03fa1e85e94672552c871b1724e33a2f.png)  

1. ダウンロードが完了したらエクスプローラでダウンロードフォルダに移動。
![picture 68](images2/fd013b6f459c53eb336ebb0b12af85dee6ec27d92f8ed2937debf556287b7e64.png)  

1. ファイルパスのところにcmdを入力してコマンドプロントを起動。
![picture 69](images2/845080bfccab3757895cc7fc348be185271bbaee8741953be6db9fee94817c79.png)  

1. 以下のコマンドを実行。  
`java -jar lombok.jar`
![picture 70](images2/b7eab52d1c900a8563fa00875c15f95fac35a08aecfbe1a6f73d0343adf28c50.png)  

1. Lombokのインストーラ画面が表示。チェックボックスにチェックを入れてInstall／Updateをクリック。
![picture 14](images/072c1e765cface0ef6d884f682ef7511747ed6c965deb594fc45e8c26fdfb3fd.png)  

1. もしこのウィンドウがでたら、左下のSpecify locationをクリック。
![picture 13](images/4d9d1bffdf5f468c779ceffca11b2316d7ad56de640c0fa05dc64d45a31fd7a8.png)  

1. インストールしたeclipse.exeを選択してから、Install/Updateをクリック。
![picture 15](images/02efa782597c3fa9b9e0f2601bfe5557c134280fd5e2c935fc4eddccd933366f.png)  

### 各種設定
1. メニューバーから`Window`->`Preferences`をクリック。
![picture 47](images/6682ea14bb0fca0d35a656f9d9c64fc3ab27e61dd22f361e62183c49a0761fec.png)  

1. 左上の検索バーに`encoding`と入力して、Workspaceを選択。`Text file encoding`をUTF-8に、`New text file line delimiter`をUnixに変更。
![picture 49](images/2c175e7a7b854a8701297d8fc2a6db9be1815963625cf68a93dd887976c1acad.png)  

1. `Apply and Close`をクリックして設定を保存。

### サンプルコードの準備

1. 自分のGitHubアカウントにログインして、[https://github.com/k-ookawara/sample-shopping-site]にアクセス。

1. 右上のForkをクリック。 
![picture 38](images/2d54169217fd548f6f0fae812c319cb32b3a45d128bc56bd44f723f66823e17d.png)  

1. Create Forkをクリック。
![picture 39](images/aff7814f9b80a06728530b82b56c02e7f242be25e567a72e7c7cc5cd465601af.png)  

1. 緑色をした`Code`ボタンをクリックしてURLをコピー。
![picture 40](images/96962a7286fa900af3e3f9cfbdef58e6d24b15b0af7c2c493bc6bfbe1a477db7.png)  

1. SourceTreeの`Clone`タブをクリックして、コピーしたURLを一番上の入力フォームにペースト。クローンをクリック。
![picture 41](images/35ba0e2f8870cfdfb850cc0a648570d7f06cfbbe03a81f35347cbc7b051cb657.png)

1. クローン完了。
![picture 42](images/a07f6e022a999e8ff634adf73dcf7e6ada3f0245d45e8786c895d9f2df4f60d6.png)

### Eclipseにインポート

1. Eclipseのメニューバーから`File`->`Import`をクリック。
![picture 44](images/bda34ccf348a9086ec567ce94376522151d4b5447a14287cd44db5e8a7e5976d.png)  

1. `General`->`Project from Folder or Archive`を選択して、Nextをクリック。
![picture 45](images/fd110917daf9f999eaab285b8ae5c68e20c79b4616618c4d176ea51fe4b4109a.png)  

1. Directoryをクリックして、上記でクローンして作成したフォルダを選択。Finishをクリック。
![picture 46](images/880cfca72773ee3caa7a4d346e566eb94c7eab15ec5d35cff4afccdda54664e3.png)  

1. `Project exploer`の`sample-shopping-site`を右クリック。下部の`Properties`をクリック。
![picture 51](images/06b2fa779c37cffaad11219b3fc012fc00772283b333e81d12cf7c98097952d4.png)  

1. 左側のリストから`Java Compiler`を選択。`Enable project specific settings`にチェックを入れて、`Compiler compliance level`を17に変更。
![picture 52](images/31e7c98c73a43e66775db84c9d28b69dbe31a4c96dbfad2c3024859e633fc58b.png)  

1. 左側リストの`Java Build Path`を選択。`Java Build Path`の`Libraries`タブをクリック。`Modulepath`->`JRE System Library`を選択した状態でEditをクリック。

1. `Installed JREs`をクリック。
![picture 53](images/dace31cff544efc9f287813a35ca6afa415787689733bc1edb6aa876377e08c1.png)  

1. ADDをクリック。
![picture 1](images/95dcf6fc3a26116f4bc0a655a23a166333eb4fc46ee7c6c08ed01f0c88fa90a5.png)  

1. `Standard VM`を選択してNextをクリック。
![picture 2](images/8caabc5b81883fb2591f03ab5ad1a20ccb029a0488d2ce7ecc2d9caed5d398f7.png)  

1. `Directory`をクリック。
![picture 7](images/374c26958b5f49b995f9a256e830bca4b827eba1672878ad0a42570f84dc5bc9.png)  


1. JDK17のホームフォルダを選択して、右下のフォルダーの選択をクリック。
![picture 6](images/5e9b56af32a0f65e31203d21f60350986b7ba8deb9cfab452187ea157e9ad38a.png)  

1. `JRE name`に任意の名前を入力して、Finishを入力。
![picture 3](images/bbf9db2803286440468c43b334f92870bc04cb704dcdb0fda76b50ad07af7a2a.png)  

1. 追加したJREにチェックを入れて`Apply and Close`をクリック。 
![picture 8](images/0ed406e29864b48c712140c464acedfc848f13d8f081f2e02cd590a1790082cb.png)  

1. Finishをクリック。 
![picture 9](images/661516f47cfa407f8456d3c028422343fc03cfdb8b8c472bb7908f082d0af203.png)  

1. `Project exploer`の`sample-shopping-site`を右クリック。下部の`Configure`->`Add Gradle Nature`をクリック。
![picture 11](images/83f542b8e95adcba4c10ae95a84bf2b3690e809bec5ef2c5a5aad69ee817d144.png)  

1. 左側Project Exploerを見てエラー（×マーク）が消えていることを確認。
![picture 52](images2/34320534c77e90d4a12488de1e69182bfa6fb5f7cc8fb397bce9c2c66a8186e3.png)

ここまででEclipseの環境構築が完了です。