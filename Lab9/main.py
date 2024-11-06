# main.py

from video.video_player import VideoPlayer
from video.video_recorder import VideoRecorder

def main():
    """Точка входа в программу."""
    
    # Создаем объект VideoPlayer и демонстрируем его функции
    player = VideoPlayer("example_video.mp4")
    player.play()
    player.stop()

    # Создаем объект VideoRecorder и демонстрируем его функции
    recorder = VideoRecorder("example_video.mp4")
    recorder.record()
    recorder.stop_recording()
    recorder.play()
    recorder.record()  # Попытка начать запись во время воспроизведения
    recorder.stop()
    recorder.record()  # Начать запись после остановки воспроизведения
    recorder.stop_recording()

if __name__ == "__main__":
    main()
