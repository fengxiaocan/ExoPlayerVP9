plugins {
  alias(libs.plugins.android.library)
  alias(libs.plugins.kotlin.android)
}

android {
  namespace = "com.google.android.exoplayer2"
  compileSdk = 33

  defaultConfig {
    minSdk = 21
    ndk {
      abiFilters.add("armeabi-v7a")
      abiFilters.add("arm64-v8a")
    }
  }

  buildTypes {
    release {
      isMinifyEnabled = false
      proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
    }
  }
  compileOptions {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
  }
  kotlinOptions {
    jvmTarget = "1.8"
  }
  sourceSets.apply {
    getByName("main").apply {
      jniLibs {
        srcDir("src/main/libs")
      }
    }
  }
}

dependencies {
  api("androidx.media:media:1.6.0")
  api("com.google.guava:guava:31.1-android") {
    // Exclude dependencies that are only used by Guava at compile time
    // (but declared as runtime deps) [internal b/168188131].
    exclude(group = "com.google.code.findbugs", module = "jsr305")
    exclude(group = "org.checkerframework", module = "checker-compat-qual")
    exclude(group = "org.checkerframework", module = "checker-qual")
    exclude(group = "com.google.errorprone", module = "error_prone_annotations")
    exclude(group = "com.google.j2objc", module = "j2objc-annotations")
    exclude(group = "org.codehaus.mojo", module = "animal-sniffer-annotations")
  }
  implementation("androidx.annotation:annotation:1.3.0")
  implementation("androidx.core:core:1.8.0")
  compileOnly("androidx.recyclerview:recyclerview:1.3.0")
  compileOnly("com.google.code.findbugs:jsr305:3.0.2")
  compileOnly("com.google.errorprone:error_prone_annotations:2.18.0")
  compileOnly("org.checkerframework:checker-compat-qual:2.5.5")
  compileOnly("org.checkerframework:checker-qual:3.13.0")
  compileOnly("org.jetbrains.kotlin:kotlin-annotations-jvm:1.8.20")
}