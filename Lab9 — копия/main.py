# main.py

from video.video_player import VideoPlayer
from video.video_recorder import VideoRecorder

def main():
    """Точка входу в програму."""
    
    # Створюємо об'єкт VideoPlayer і демонструємо його функції
    player = VideoPlayer("example_video.mp4")
    player.play()
    player.stop()

    # Створюємо об'єкт VideoRecorder і демонструємо його функції
    recorder = VideoRecorder("example_video.mp4")
    recorder.record()
    recorder.stop_recording()
    recorder.play()
    recorder.record()  # Спроба почати запис під час відтворення
    recorder.stop()
    recorder.record()  # Почати запис після зупинки відтворення
    recorder.stop_recording()

if __name__ == "__main__":
    main()