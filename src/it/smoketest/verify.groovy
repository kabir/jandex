def jandexFile = new File(basedir, 'target/classes/META-INF/jandex.idx')
assert jandexFile.exists() : "File does not exist: $jandexFile}"
assert jandexFile.length() > 0 : "File is empty: $jandexFile}"
