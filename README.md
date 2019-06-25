# pickerview
时间空间


将其添加到存储库末尾的根build.gradle中：

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
步骤2.添加依赖项

	dependencies {
	        implementation 'com.github.djkyqkzj:pickerview:Tag'
	}
