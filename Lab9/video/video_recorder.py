# video/video_recorder.py

from .video_player import VideoPlayer

class VideoRecorder(VideoPlayer):
    """Производный класс для записи видео, наследуется от VideoPlayer."""
    
    def __init__(self, video_name):
        """
        Инициализация видеомагнитофона с именем видео.
        :param video_name: Название видео файла
        """
        super().__init__(video_name)
        self.is_recording = False

    def record(self):
        """Метод для начала записи видео."""
        if not self.is_playing:
            print(f"Начало записи видео: {self.video_name}")
            self.is_recording = True
        else:
            print("Невозможно начать запись во время воспроизведения.")

    def stop_recording(self):
        """Метод для остановки записи видео."""
        if self.is_recording:
            print(f"Запись остановлена: {self.video_name}")
            self.is_recording = False
        else:
            print("Запись не активна.")
