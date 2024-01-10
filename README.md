# Easy SharedPreference

So easy to use. for lazy developer like me :)
사용하기 쉽습니다. 저 처럼 게으른 개발자를 위한!


# Usage

just set, setString setBoolean setInt...
how to get? getString getBoolean getInt...
```kotlin
setString(context:Context, key:String, value:String)

setBoolean(context:Context, key:String, value:Boolean)

setInt(context:Context, key:String, value:Int)

getString(context: Context, key: String, defaultValue:String)

getBoolean(context: Context, key: String, defaultValue:Boolean)

getInt(context: Context, key: String, defaultValue:Int)
```

this is example.
```kotlin
if(pref().getBoolean(this, "isFirst", false)) { //get named by "isFirst", the default value is false.
	pref().setBoolean(this, "isFirst", true) //key "isFirst" to true
}

//if you want to make default value to true, just getBoolean(this, "isFirst", true)
```

sorry for my poor english ;p
