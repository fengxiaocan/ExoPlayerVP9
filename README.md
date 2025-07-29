# ExoPlayerVP9
修改ExoPlayer的VP9使得能播放具有透明通道视频

> 只有exoplayer的vp9模块才能支持透明视频播放，原始的v1.8.0版本不直接支持透明视频播放，需要更改c++以及java原生库的代码才能支持播放，项目根据github库修改，[vp9透明视频播放器demo](https://github.com/zxzx74147/ExoPlayer)这个库最高支持版本为sdk29版本，需要更新到29版本以上的需要按照以下规则更新exoplayer的播放库。
>
> 项目基于[GoogleExoplayer](https://github.com/google/ExoPlayer)修改，exoplayer-v2.19.1版本的vp9建议支持的版本为1.8.0，即为[vp9透明视频播放器demo](https://github.com/zxzx74147/ExoPlayer)这个库的vp9编译版本，如果超过这个版本，需要根据[这个库的提交日志修改对应的c++代码java代码然后编译打包](https://github.com/google/ExoPlayer/compare/release-v2...zxzx74147:ExoPlayer:dev-v2-r2.11.8-transparency)

