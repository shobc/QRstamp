# WEB上でQRを使ってスタンプラリーの開発

## 手順

### 最初にQRを読み取らせる

* フロントで名前を記述後QR（トップページに飛ぶサイト）を読み取らせる

* 携帯を持っていない人は紙で渡すようにする



### 読み取られると端末ごとにIP番号を取得する

* propertiesファイルにIP番号が入る

* sessionで10時間だけ持たせるようにする




### スタンプをする画面が表示される

* 各学科の名前と枠が用意される



### 各学科のQRを読み取る

* サイトを開かずカメラでQRを読み取り、URLの後ろにパラメータとして値を入れて各学科に対応するkeyにtrueを書く（[QRを作成するサイト](https://tool-taro.com/qr_code_encode/)）


### スタンプの表示

* propertiesファイルから値をとってきて、true判定をしてその学科のスタンプが押される



### 最後に見せる

* 全部たまったらBINGOカードと交換する（その際に完了ボタンを押すと「済」と表示される）



___

## スタンプのデザイン　
### [外部サイト](http://generator.tubudeco.com/g1256/)で作成
* 済みスタンプのみ生成

## セキュリティ対策

* パラメータを隠す（スタンプの不正を防ぐ）

## 例外対策

* Sessionを持っていないのに各学科のQRを読み取った場合
* Sessionを持っていないのにBINGOカード交換確認画面にアクセスした場合

## 使う言語
* java
* HTML
* CSS
* JavaScript

## 使う環境
* スマホ

## サーバー環境
* tomcat
* AWS

##追加した機能
### アンケート機能
* Googleフォームを使用


## 追加機能（できたら）

### 各学科の案内
* スタンプが押される学科ごとに表示される名前を押すと展示物など説明が表示される

### ネット上にBINGOカードを生成する
* BINGO大会で出てくる数字と連動して動くため数字の確認をしなくてよくなる

## 問題点
### 土曜日と日曜日で同じIPアドレスアクセスしたときの対処
* ファイルのデータをほかのデータに移してサーバーに上がっているファイルを空にする
### 整合性が取れているのか
* 調査中

## propertiesファイルの構成

* key
  * ユーザーごとの管理するための番号(sessionで管理される)

* valueでの順番
  * 1:建築監督
  * 2:建築
  * 3:インテリア
  * 4:情報処理
  * 5:ゲームプログラミング
  * 6:web動画クリエーター
  * 7:環境テクノロジー
  * 8:バイオテクノロジー

