# Eclipaseの環境構築

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

1. `INSTALL`をクリック。
![picture 14](images/f444186731d44da1daee0b3d656cbd4010881e381811450f2c339ef22657986b.png)  

1. インストール完了したら`LAUNCH`をクリックして起動。
![picture 15](images/3927c0c103408c766864bcb8780621a4baf65d9a53d20fbffd6e40491f01eb73.png)  

1. これも`LAUNCH`をクリックして起動。
![picture 16](images/9e67cd1e75aa96d571c4a1a9bba099bef535e13f591a28d72ffdd2d97e92e580.png)  

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

1. 
![picture 53](images/dace31cff544efc9f287813a35ca6afa415787689733bc1edb6aa876377e08c1.png)  
