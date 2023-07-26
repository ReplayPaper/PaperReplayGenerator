# PaperReplayGenerator

A paperweight fork to integrate capturing of regions to [ReplayMod](https://github.com/ReplayMod/ReplayMod) files,
capturing all details in the region and thus providing better replays for cinematics than replays created from a player point of view.
To create a replay file (.mcpr) from your server plugin, use:

```java
RecordingCreator recording = Bukkit.getServer().newRecordingCreator(
                                                    File dir,
                                                    Location spawnLocation,
                                                    int lcx,
                                                    int hcx,
                                                    int lcz,
                                                    int hcz
                                                );
recording.beginRecording();
// Wait some time or do sth...
recording.endRecording(file->System.out.println("Replay has been saved to "+file.getAbsolutePath()));
```

The parameters explained:

- `dir`: A unique directory to use for temporary files. Also decides the file name of the replay
- `spawnLocation`: The location where the player should spawn when viewing the replay
- `lcx`: The lower chunk coordinate on the x-axis (inclusive)
- `hcx`: The higher chunk coordinate on the x-axis (inclusive)
- `lcz`: The lower chunk coordinate on the z-axis (inclusive)
- `hcx`: The higher chunk coordinate on the z-axis (inclusive)

The replay creator will automatically swap the coordinates if lcx>hcx or lcz>hcz.

## TODO
- Create a basic plugin interacting with the replay API

## License

The PaperReplayGenerator is provided under the terms of the GNU General Public License Version 3 or (at your option) any later version.
See https://www.gnu.org/licenses/ for the full license text.
