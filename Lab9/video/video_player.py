# video/video_player.py

class VideoPlayer:
    """Базовий клас для відтворення відео."""
    
    def __init__(self, video_name):
        """
        Ініціалізація відеоплеєра з назвою відео.
        :param video_name: Назва відеофайлу
        """
        self.video_name = video_name
        self.is_playing = False

    def play(self):
        """Метод для початку відтворення відео."""
        self.is_playing = True
        print(f"Відтворення відео: {self.video_name}")

    def stop(self):
        """Метод для зупинки відтворення відео."""
        self.is_playing = False
        print(f"Відтворення зупинено: {self.video_name}")