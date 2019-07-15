# QRWEBアプリケーションの動き

## 通常の動き（URL）
### RegisterServlet
* 登録を行う
### stamp.jspに飛ぶ
* スタンプの一覧
### QRServlet
* URLの後ろにパラメータがついて各学科に対応する
### Confirm.html
* スタンプがすべて済みになると確認ボタンが表示され移動する
### QRServlet
* スタンプの画面でカード交換が済みになる

## tomcatが落ちた場合（URL）
### RevivalSessionAccessServlet
* cookieから番号を取得する
### RevivalSession.jsp
* cookieで保持されている番号がURLのパラメータにつく
### stamp.jspに飛ぶ
* スタンプ一覧